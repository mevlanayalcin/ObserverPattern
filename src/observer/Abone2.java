package observer;

import subject.MevlanaYalcinYoutubeKanali;

public class Abone2 implements InterfaceAbone
{




    @Override
    public void bildirimAl()
    {

        System.out.println("Mevlana Yalcin kanalinin yeni bir video yüklediği bilgisi Abone2 ye gönderildi");
    }
}