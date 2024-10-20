package defpackage;

import android.R;
import android.content.Context;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcc implements yzd {
    public static final xze a = xze.g("BugleContacts", "StartChatRcsUiAdapterImpl");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector");
    public final Context c;
    public final xbf d;
    public final armf e;
    public final mbl f;
    public final ascd g;
    public final ascd h;
    public final ascd i;
    public final asai j;
    public final lre k;
    public final zen l;
    public final zbu m;
    private final arwe n;
    private final arpi o;
    private final vqu p;
    private final pga q;

    public zcc(arwe arweVar, Context context, arpi arpiVar, zen zenVar, zbu zbuVar, lre lreVar, vqu vquVar, xbf xbfVar, armf armfVar, mbl mblVar, pga pgaVar) {
        asai a2;
        arweVar.getClass();
        context.getClass();
        arpiVar.getClass();
        zenVar.getClass();
        zbuVar.getClass();
        lreVar.getClass();
        vquVar.getClass();
        xbfVar.getClass();
        armfVar.getClass();
        mblVar.getClass();
        this.n = arweVar;
        this.c = context;
        this.o = arpiVar;
        this.l = zenVar;
        this.m = zbuVar;
        this.k = lreVar;
        this.p = vquVar;
        this.d = xbfVar;
        this.e = armfVar;
        this.f = mblVar;
        this.q = pgaVar;
        this.g = ascy.a(true);
        this.h = ascy.a(true);
        this.i = ascy.a(new zbv(null, 7));
        if (((ansy) ((pfl) pgaVar).a.b()).e("bugle.use_max_group_size_from_active_self_identity")) {
            a2 = new qkk(((zeo) armfVar.b()).e, this, 12);
        } else {
            a2 = ascy.a(new zbw(xbfVar.a(-1).g(), vquVar.f(Optional.empty()) - 1));
        }
        this.j = a2;
    }

    @Override // defpackage.yzd
    public final void a() {
        qjh.l(this.n, this.o, new zcb(this, (arpe) null, 1, (byte[]) null), 2);
        qjh.l(this.n, this.o, new zcb(this, (arpe) null, 0), 2);
    }

    public final aepx b(String str, List list, arqg arqgVar, arqg arqgVar2) {
        String string = this.c.getString(R.string.ok);
        string.getClass();
        aewr aewrVar = new aewr(string, arqgVar);
        String string2 = this.c.getString(R.string.cancel);
        string2.getClass();
        return new aepx(str, list, null, null, false, false, aewrVar, new aewr(string2, arqgVar2), arqgVar2, 60);
    }

    public final aepx c(ChipData chipData, int i) {
        String P = gvf.P(this.c, com.google.android.apps.messaging.R.string.group_limit_alert_dialog_message, "max_group_size_excluding_self", Integer.valueOf(i));
        String string = this.c.getString(R.string.ok);
        string.getClass();
        return new aepx(P, null, null, null, false, false, new aewr(string, new quz(this, chipData, 18, null)), null, new quz(this, chipData, 19, null), 190);
    }
}
