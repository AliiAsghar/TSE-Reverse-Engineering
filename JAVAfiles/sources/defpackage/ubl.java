package defpackage;

import android.content.Context;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ubl {
    public static final xze a = xze.g("BugleDataModel", "DataModelImpl");
    public final xyt b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final akbm j;
    public final aksr k;
    public final alhr l;
    private final Context n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final AtomicReference w = new AtomicReference(ruy.a);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public ubl(Context context, anen anenVar, xyt xytVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, akbm akbmVar, aksr aksrVar, armf armfVar15, armf armfVar16, armf armfVar17, apwt apwtVar, armf armfVar18) {
        this.n = context;
        this.b = xytVar;
        this.o = armfVar;
        this.p = armfVar2;
        this.q = armfVar3;
        this.c = armfVar4;
        this.d = armfVar5;
        this.e = armfVar7;
        this.f = armfVar8;
        this.g = armfVar10;
        this.h = armfVar11;
        this.r = armfVar13;
        this.i = armfVar14;
        this.j = akbmVar;
        this.k = aksrVar;
        this.s = armfVar15;
        this.t = armfVar16;
        this.u = armfVar17;
        this.v = armfVar18;
        this.l = albo.D(new ubi(apwtVar, armfVar8, armfVar12, armfVar9, armfVar6, anenVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [arwe, java.lang.Object] */
    public final void a() {
        int i = 1;
        byte[] bArr = null;
        if (!d() && ((yjv) this.t.b()).d()) {
            if (yhx.g(this.n)) {
                ubn ubnVar = (ubn) this.u.b();
                ((atsg) ubnVar.a.b()).j(Telephony.MmsSms.CONTENT_URI, true, ubnVar);
                ((wzp) this.d.b()).l(amvm.SECONDARY_USER_SYNC);
            } else {
                ubn ubnVar2 = (ubn) this.u.b();
                ((atsg) ubnVar2.a.b()).k(ubnVar2);
                wpp wppVar = (wpp) this.r.b();
                qjh.l(wppVar.c, null, new uxs(wppVar, (arpe) null, 14), 3);
            }
        }
        uxe uxeVar = (uxe) this.s.b();
        ahqq a2 = ((mgv) uxeVar.d.b()).a();
        abzs abzsVar = uxeVar.f;
        acit acitVar = new acit();
        ((abzu) abzsVar).a.execute(new acaj(abzsVar, acitVar, i, bArr));
        acir acirVar = (acir) acitVar.a;
        acirVar.o(uxeVar.e, new vdn(uxeVar, a2, i, bArr));
        acirVar.p(uxeVar.e, new vdo(uxeVar, a2, i, bArr));
        ((uhc) this.o.b()).a();
        ((mce) this.p.b()).g();
        if (uzz.f()) {
            ((uyc) this.v.b()).a();
        }
    }

    public final void b(ConversationIdType conversationIdType) {
        if (!((ConversationIdType) this.w.getAndSet(conversationIdType)).equals(conversationIdType)) {
            a.p("focusedConversation=".concat(conversationIdType.toString()));
        }
    }

    public final boolean c(ConversationIdType conversationIdType) {
        ConversationIdType conversationIdType2 = (ConversationIdType) this.w.get();
        if (!conversationIdType2.b() && conversationIdType2.equals(conversationIdType)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return ((Optional) ((apxx) this.q).a).isPresent();
    }

    public final boolean e(ConversationIdType conversationIdType) {
        return c(conversationIdType);
    }
}
