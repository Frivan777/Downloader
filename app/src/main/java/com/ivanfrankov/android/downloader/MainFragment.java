package com.ivanfrankov.android.downloader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainFragment extends Fragment {

    RecyclerView mRecyclerView;
    private static final String DIALOG_NOTIFICATION = "DialogNotification";
    private boolean flag = false;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_list_image, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.fragment_image_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        setupAdapter();

        return v;
    }

    private void setupAdapter() {
        if (isAdded()) {
            mRecyclerView.setAdapter(new ImageAdapter(UrlLab.get().getUrlList()));
        }
    }

    private class ImageHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public ImageHolder(View itemView) {
            super(itemView);

            mImageView = (ImageView) itemView.findViewById(R.id.fragment_list_image_view);
        }

        public void bindImage(Url url) {

           Callback callBackFinish = new Callback() {
                @Override
                public void onSuccess() {

                    if ((getAdapterPosition() == 19) && !flag) {
                        flag = true;
                        FragmentManager fm = getFragmentManager();
                        NotificationFragment dialog = new NotificationFragment();
                        dialog.show(fm, DIALOG_NOTIFICATION);
                    }

                }

                @Override
                public void onError() {

                }
            };

            Picasso.with(getActivity())
                    .load(url.getUrl())
                    .into(mImageView, callBackFinish);
        }
    }

    private class ImageAdapter extends RecyclerView.Adapter<ImageHolder> {
        private List<Url> mUrlList;

        public ImageAdapter(List<Url> urlList) {
            mUrlList = urlList;
        }

        @Override
        public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater.inflate(R.layout.list_item, parent, false);
            return new ImageHolder(view);
        }

        @Override
        public void onBindViewHolder(ImageHolder holder, int position) {
            holder.bindImage(mUrlList.get(position));
        }

        @Override
        public int getItemCount() {
            return mUrlList.size();
        }
    }
}
