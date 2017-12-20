package test;

import observer.Abone1;
import observer.Abone2;
import subject.InterfaceYoutubeKanali;
import subject.MevlanaYalcinYoutubeKanali;

public class Test
{
    public static void main(String[] args)
    {
        InterfaceYoutubeKanali youtubeKanali=new MevlanaYalcinYoutubeKanali();
        youtubeKanali.aboneEkle(new Abone1());
        youtubeKanali.aboneEkle(new Abone2());//Kanala abone ekliyoruz
        youtubeKanali.kanalVideoYukledi();//bildirim göndermeyi tetikleyecek
    }


}
