package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxh {
    public static final alwo a = alwo.o("Bugle");
    public static final alhr b = uuh.y("block_use_bcm");
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final xxe g;
    public final armf h;
    public final xwt i;
    public final uhj j;
    public final agnq k;
    public final armf l;
    public final armf m;
    public final arwe n;
    public final armf o;
    public final armf p;
    public final armf q;
    private final armf r;

    public xxh(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xxe xxeVar, armf armfVar5, xwt xwtVar, uhj uhjVar, armf armfVar6, agnq agnqVar, armf armfVar7, armf armfVar8, arwe arweVar, armf armfVar9, @oqd armf armfVar10, armf armfVar11) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        xxeVar.getClass();
        armfVar5.getClass();
        xwtVar.getClass();
        uhjVar.getClass();
        armfVar6.getClass();
        agnqVar.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        arweVar.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = xxeVar;
        this.h = armfVar5;
        this.i = xwtVar;
        this.j = uhjVar;
        this.r = armfVar6;
        this.k = agnqVar;
        this.l = armfVar7;
        this.m = armfVar8;
        this.n = arweVar;
        this.o = armfVar9;
        this.p = armfVar10;
        this.q = armfVar11;
    }

    public static final Boolean g(String str) {
        akrh e = aktp.e("DestinationBlocker#isBlockedDestinationInBugleDb");
        try {
            tbd tbdVar = new tbd();
            tbdVar.l(str);
            if (ytd.i(str, ytd.a)) {
                tbd tbdVar2 = new tbd();
                tbdVar2.W(new agpk("PHONE_NUMBERS_EQUAL($V, $V, 0)", new Object[]{ParticipantsTable.c.f, str}));
                tbd tbdVar3 = new tbd();
                tbdVar3.V(tbdVar, tbdVar2);
                tbdVar = tbdVar3;
            }
            tbdVar.q(-2);
            taz e2 = ParticipantsTable.e();
            e2.w("+isBlockedDestinationInBugleDb");
            e2.d(new xos(18));
            e2.f(tbdVar);
            agmq n = e2.b().n();
            try {
                tav tavVar = (tav) n;
                if (tavVar.getCount() == 0) {
                    armd.i(n, null);
                    armd.i(e, null);
                    return null;
                }
                while (tavVar.moveToNext()) {
                    if (tavVar.R()) {
                        armd.i(n, null);
                        armd.i(e, null);
                        return true;
                    }
                }
                armd.i(n, null);
                armd.i(e, null);
                return false;
            } finally {
            }
        } finally {
        }
    }

    private final void h(String str) {
        qiu.h(((uvi) this.r.b()).b(new IllegalArgumentException(a.bW(str, "Destination input to DestinationBlocker#", " is null or empty"))));
    }

    public final ParticipantsTable.BindData a(String str) {
        return ((rxq) this.e.b()).c(str);
    }

    public final xxi b(final xxc xxcVar) {
        aiut.b();
        final aozy createBuilder = xxi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = xxcVar.b;
        apag apagVar = createBuilder.b;
        xxi xxiVar = (xxi) apagVar;
        xxiVar.b |= 1;
        xxiVar.c = str;
        boolean z = xxcVar.c;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        xxi xxiVar2 = (xxi) apagVar2;
        xxiVar2.b |= 8;
        xxiVar2.f = z;
        boolean z2 = xxcVar.d;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        xxi xxiVar3 = (xxi) createBuilder.b;
        xxiVar3.b |= 16;
        xxiVar3.g = z2;
        int an = a.an(xxcVar.h);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xxi xxiVar4 = (xxi) createBuilder.b;
        xxiVar4.b |= 32;
        xxiVar4.h = an;
        return (xxi) this.k.c("DestinationBlocker#updateBlockStatus", new alhr() { // from class: xxf
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0170, code lost:
            
                if (r0 != null) goto L68;
             */
            @Override // defpackage.alhr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 588
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xxf.get():java.lang.Object");
            }
        });
    }

    public final String c(String str) {
        akrh e = aktp.e("DestinationBlocker#getDestinationForBlockCheck");
        try {
            ParticipantsTable.BindData b2 = ((rxq) this.e.b()).b(str);
            if (b2 != null) {
                String J = b2.J();
                if (TextUtils.isEmpty(J)) {
                    qiu.h(((uvi) this.r.b()).b(new IllegalArgumentException("Destination is Rbm but has no empty destination")));
                } else {
                    armd.i(e, null);
                    return J;
                }
            }
            armd.i(e, null);
            return str;
        } finally {
        }
    }

    public final boolean d(msh mshVar) {
        return e(mshVar.l(true));
    }

    public final boolean e(String str) {
        aiut.b();
        if (str != null && str.length() != 0) {
            Boolean g = g(str);
            if (g != null) {
                return g.booleanValue();
            }
            return f(str);
        }
        h("isBlockedInBugleFallbackToTelephony");
        return false;
    }

    public final boolean f(String str) {
        aiut.b();
        boolean z = false;
        if (str.length() == 0) {
            h("isBlockedInTelephony");
            return false;
        }
        akrh e = aktp.e("DestinationBlocker#isBlocked");
        try {
            if (this.g.d()) {
                Optional a2 = ((xxd) this.h.b()).a(c(str));
                if (a2.isPresent()) {
                    boolean booleanValue = ((Boolean) a2.get()).booleanValue();
                    armd.i(e, null);
                    return booleanValue;
                }
            }
            Boolean g = g(str);
            if (g != null) {
                z = g.booleanValue();
            }
            armd.i(e, null);
            return z;
        } finally {
        }
    }
}
