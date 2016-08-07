package com.ivanfrankov.android.downloader;


import java.util.ArrayList;

public class UrlLab {
    private static UrlLab sUrlLab;
    private ArrayList<Url> mUrlList;

    private  UrlLab() {
        mUrlList = new ArrayList<>();
        mUrlList.add(new Url("http://www.stihi.ru/pics/2011/04/07/8199.jpg"));
        mUrlList.add(new Url("http://www.porjati.ru/uploads/posts/2010-10/1288454417_klubnika-brizgi-1600.jpg"));
        mUrlList.add(new Url("http://img.murmanout.ru/000/041/526/important/41526.jpg"));
        mUrlList.add(new Url("http://p1.pichost.me/640/25/1481103.jpg"));
        mUrlList.add(new Url("http://www.kartinkijane.ru/pic/201305/640x480/kartinkijane.ru-56925.jpg"));
        mUrlList.add(new Url("http://best-funnycatsanddogs.com/uploads/posts/2015-11/31_british_shorthair.jpg"));
        mUrlList.add(new Url("http://www.fullhdoboi.com/wallpapers/thumbs/21/kartinka-ded-7986.jpg"));
        mUrlList.add(new Url("http://nevseoboi.com.ua/uploads/posts/2012-06/thumbs/1339241326-899106-0112511_www.nevseoboi.com.ua.jpg"));
        mUrlList.add(new Url("http://boombob.ru/img/picture/Jun/24/cd6ac5d5ef622cb49fcf3d1bd8b75902/9.jpg"));
        mUrlList.add(new Url("http://www.wallpaperhi.com/thumbnails/detail/20120306/flowers%20macro%20depth%20of%20field%202560x1600%20wallpaper_www.wallpaperhi.com_14.jpg"));
        mUrlList.add(new Url("http://www.downloadyui.xyz/media/npict/1201/big/best_hd_wallpapers_pack_477_1316430.jpeg"));
        mUrlList.add(new Url("http://yahooeu.ru/uploads/posts/2011-03/1298999319_1280h1024.-19.jpg"));
        mUrlList.add(new Url("http://s4.favim.com/orig/140405/colorful-disney-dream-pixar-Favim.com-1613654.jpg"));
        mUrlList.add(new Url("http://images.stopgame.ru/uploads/images/226977/form/normal_1317729450.jpg"));
        mUrlList.add(new Url("http://www.proza.ru/pics/2014/01/10/1435.jpg"));
        mUrlList.add(new Url("http://11c.ru/files/articles/283/img/873513674.jpg"));
        mUrlList.add(new Url("http://sexytrend.ru/images/product/4/preview/19358.jpg"));
        mUrlList.add(new Url("http://www.dailyslow.it/wp-content/uploads/2013/12/auto-del-futuro-0-420x236.jpg"));
        mUrlList.add(new Url("http://www.anypics.ru/pic/201211/640x480/anypics.ru-47625.jpg"));
        mUrlList.add(new Url("http://luxfon.com/download.php?file=201203/1024x600/luxfon.com-4988.jpg"));
    }

    public static UrlLab get() {
        if (sUrlLab == null) {
            sUrlLab = new UrlLab();
        }

        return sUrlLab;
    }

    public ArrayList<Url> getUrlList() {
        return mUrlList;
    }
}
