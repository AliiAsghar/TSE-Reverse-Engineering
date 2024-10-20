package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public izz(Context context, arpi arpiVar, arwe arweVar, asai asaiVar, asai asaiVar2, jxv jxvVar) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        jxvVar.getClass();
        this.a = context;
        this.f = arpiVar;
        this.b = arweVar;
        this.e = asaiVar;
        this.d = asaiVar2;
        this.h = jxvVar;
        this.g = new LinkedHashMap();
        this.c = armd.n(new jdn(asaiVar2, asaiVar, new igb(this, (arpe) null, 0), 17, null), arpiVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [arwe, java.lang.Object] */
    public final ascv a() {
        jdn jdnVar = new jdn(this.c, ((lxe) this.f).b, new jdu(this, (arpe) null, 8), 17, null);
        int i = ascp.a;
        return arrn.T(jdnVar, this.e, asco.a(0L, 3), this.g);
    }

    public izz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, jaa jaaVar) {
        this.a = (izx) armfVar.b();
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = jaaVar.b;
        this.g = ruy.b(jaaVar.d);
        msz mszVar = jaaVar.c;
        this.h = mszVar == null ? msz.a : mszVar;
    }

    public izz(Context context, arwe arweVar, lxe lxeVar, ghw ghwVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        lxeVar.getClass();
        ghwVar.getClass();
        armfVar.getClass();
        this.b = context;
        this.e = arweVar;
        this.f = lxeVar;
        this.a = ghwVar;
        this.h = armfVar;
        this.c = ascy.a(false);
        String string = context.getString(R.string.multi_share_edit_message_top_app_bar_title);
        string.getClass();
        boolean z = false;
        afas afasVar = new afas(string, null, null, z, null, null, null, 254);
        String string2 = context.getString(R.string.action_back);
        string2.getClass();
        afaw afawVar = new afaw(afasVar, new aehz(string2, aerb.n, false, false, false, false, null, null, new kjm(this, 20), 1020), 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 116);
        this.d = afawVar;
        this.g = new lgh(false, arnv.a, ghwVar.s(), afawVar);
    }
}
