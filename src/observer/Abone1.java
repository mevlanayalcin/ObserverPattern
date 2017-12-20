package observer;

import subject.InterfaceYoutubeKanali;
import subject.MevlanaYalcinYoutubeKanali;

public class Abone1 implements InterfaceAbone
{


    @Override
    public void bildirimAl()
    {

        System.out.println("Mevlana Yalcin kanalinin yeni bir video yüklediği bilgisi Abone1 e gönderildi");
    }
}
