package subject;

import observer.InterfaceAbone;

import java.util.ArrayList;
import java.util.List;

public class MevlanaYalcinYoutubeKanali implements InterfaceYoutubeKanali
{
    private List<InterfaceAbone> aboneList;


    public MevlanaYalcinYoutubeKanali()
    {
        this.aboneList=new ArrayList<>();
    }

    @Override
    public void aboneEkle(InterfaceAbone interfaceAbone)
    {
        this.aboneList.add(interfaceAbone);
    }

    @Override
    public void aboneSil(InterfaceAbone interfaceAbone)
    {
        this.aboneList.remove(interfaceAbone);

    }

    public void kanalVideoYukledi()
    {
        bildirimGonder();
    }

    @Override
    public void bildirimGonder()
    {
        for(InterfaceAbone abone:aboneList)
        {
            abone.bildirimAl();
        }
    }
}
