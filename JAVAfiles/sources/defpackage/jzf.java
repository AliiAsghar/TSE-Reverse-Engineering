package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl");
    public final Context b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final oxy f;
    public final ascv g;
    public final ascv h;
    public final ascv i;
    public final ascv j;
    public final lre k;
    public final wfh l;
    private final asai m;

    /* JADX WARN: Type inference failed for: r0v10, types: [asai, java.lang.Object] */
    public jzf(Context context, arwe arweVar, asai asaiVar, asai asaiVar2, asai asaiVar3, khg khgVar, jxv jxvVar, obu obuVar, Optional optional, @oqd armf armfVar, armf armfVar2, armf armfVar3, wfh wfhVar, lre lreVar, oxy oxyVar) {
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        khgVar.getClass();
        jxvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        wfhVar.getClass();
        lreVar.getClass();
        this.b = context;
        this.m = asaiVar3;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.l = wfhVar;
        this.k = lreVar;
        this.f = oxyVar;
        kaf kafVar = new kaf(asaiVar, this, obuVar, arweVar, asaiVar, 1);
        int i = ascp.a;
        this.g = arrn.T(kafVar, arweVar, asco.a, null);
        this.h = arrn.T(new jdn(asaiVar2, asar.a(new jxj(jxvVar.a, 9)), new jdu(khgVar, (arpe) null, 7), 17, null), arweVar, asco.a, null);
        if (((Boolean) armfVar.b()).booleanValue() && ((oqb) armfVar2.b()).a()) {
            optional.isPresent();
        }
        this.i = ascy.a(null);
        this.j = arrn.T(asaiVar3, arweVar, asco.a, false);
    }

    public final kif a(alog alogVar, lrc lrcVar, arqg arqgVar) {
        ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            mwt mwtVar = (mwt) it.next();
            vyv vyvVar = (vyv) this.e.b();
            ResolvedRecipient resolvedRecipient = mwtVar.a;
            resolvedRecipient.getClass();
            arqg arqgVar2 = null;
            aewg aewgVar = new aewg(vyvVar.s(resolvedRecipient), null, 0, null, arqgVar2, 62);
            String r = mwtVar.a.r(true);
            r.getClass();
            arrayList.add(new aesk(aewgVar, r, null, 0 == true ? 1 : 0, arqgVar2, 60));
        }
        return new kif(arrayList, new jkq(arqgVar, lrcVar, 8, null));
    }
}
