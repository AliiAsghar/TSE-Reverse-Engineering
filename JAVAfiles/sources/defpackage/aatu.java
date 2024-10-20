package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatu extends no {
    public boolean c = true;
    public final List d = new ArrayList();
    private final hlp e;
    private final aats f;

    public aatu(Context context, aats aatsVar) {
        this.f = aatsVar;
        this.e = (hlp) hkz.c(context).c().p(hxc.e()).o(huz.b()).aa();
    }

    @Override // defpackage.no
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new aauf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_item_view_m2_sg, viewGroup, false), this.e, this.f);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        final aauf aaufVar = (aauf) ooVar;
        final GifContentItem gifContentItem = (GifContentItem) this.d.get(i);
        final boolean z = this.c;
        String str = gifContentItem.f() + ":" + gifContentItem.d();
        af afVar = new af();
        afVar.e((ConstraintLayout) aaufVar.v);
        afVar.a(((ImageView) aaufVar.t).getId()).w = str;
        afVar.b((ConstraintLayout) aaufVar.v);
        ((hlp) aaufVar.u).h(gifContentItem.a).t((ImageView) aaufVar.t);
        ((ImageView) aaufVar.t).setOnClickListener(new View.OnClickListener() { // from class: aaty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aauf aaufVar2 = aauf.this;
                Object obj = aaufVar2.s;
                aats aatsVar = (aats) obj;
                abdc abdcVar = aatsVar.g;
                GifBrowserActivity gifBrowserActivity = aatsVar.a;
                int b = aaufVar2.b();
                abdcVar.i(gifBrowserActivity, aatsVar.j);
                Intent intent = new Intent();
                GifContentItem gifContentItem2 = gifContentItem;
                intent.putExtra("gif_content_item", gifContentItem2);
                intent.putExtra("gif_position_selected", b);
                aatsVar.a.setResult(-1, intent);
                int i2 = 5;
                if (!z) {
                    qjb.a(new aanh(obj, gifContentItem2, 5), aatsVar.b);
                }
                String str2 = aatsVar.s;
                int i3 = 4;
                if (str2 != null) {
                    int i4 = 2;
                    if (aatsVar.t != 2 && (aatsVar.d instanceof yee)) {
                        yem yemVar = new yem(gifContentItem2.h, str2);
                        yee yeeVar = (yee) aatsVar.d;
                        yea yeaVar = yeeVar.e;
                        Context context = yeeVar.f;
                        String str3 = yea.a;
                        String c = yee.c(yhx.b(context));
                        qiu.h(akul.g(yeaVar.a(str3, yemVar.a, yemVar.b, c)).h(new yeb(1), yeeVar.g).e(atpc.class, new yeb(0), yeeVar.g).e(UnknownHostException.class, new yeb(i4), yeeVar.g).e(SSLHandshakeException.class, new yeb(3), yeeVar.g).e(ConnectException.class, new yeb(i3), yeeVar.g).e(SocketTimeoutException.class, new yeb(i2), yeeVar.g));
                    }
                }
                ((mho) aatsVar.c.b()).aG(4, aatsVar.t, aatsVar.i.m());
                aatsVar.e(amqd.SELECTION);
            }
        });
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return ((GifContentItem) this.d.get(i)).e.hashCode();
    }
}
