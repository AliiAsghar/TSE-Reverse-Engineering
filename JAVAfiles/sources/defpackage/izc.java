package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izc {
    public final Object a;

    public izc(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final int a(boolean z, boolean z2, boolean z3, qpd qpdVar) {
        qpdVar.getClass();
        if (((trz) this.a.b()).i() && z && z2 && z3) {
            return 14;
        }
        if (!z || !z2) {
            return 7;
        }
        if (qpd.RCS_GROUP_SELF_ONLY != qpdVar) {
            return 5;
        }
        return 12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mbl, java.lang.Object] */
    public final void b() {
        this.a.c("Bugle.RemoveUser.Dialog.Confirmed");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final jqh c(arqr arqrVar, arqv arqvVar, arqr arqrVar2, arqv arqvVar2, arqv arqvVar3) {
        arpi arpiVar = (arpi) this.a.b();
        arpiVar.getClass();
        return new jqh(arpiVar, arqrVar, arqvVar, arqrVar2, arqvVar2, arqvVar3);
    }

    public final String d(afcv afcvVar) {
        afcvVar.getClass();
        String string = ((Context) this.a).getResources().getString(afcvVar.d().b.a());
        string.getClass();
        String string2 = ((Context) this.a).getString(R.string.local_attachment_content_description_format, string, aeke.bs(afcvVar.f()));
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [armf, java.lang.Object] */
    public final void e(amko amkoVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_GAIA_INTEGRATION_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amkoVar.getClass();
        amfrVar2.aV = amkoVar;
        amfrVar2.f |= 4096;
        aozy createBuilder = ameo.a.createBuilder();
        int i = xyp.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ameo ameoVar = (ameo) createBuilder.b;
        int i2 = i - 1;
        if (i != 0) {
            ameoVar.d = i2;
            ameoVar.b |= 64;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar3 = (amfr) amfqVar.b;
            ameo ameoVar2 = (ameo) createBuilder.s();
            ameoVar2.getClass();
            amfrVar3.j = ameoVar2;
            amfrVar3.b |= 2;
            ((maq) this.a.b()).n(amfqVar);
            return;
        }
        throw null;
    }

    public final boolean f(cj cjVar) {
        Bundle bundle;
        if (!kpt.a()) {
            return false;
        }
        if (cjVar.aK().e()) {
            bundle = cjVar.aK().b("tiktok_account_controller_saved_instance_state");
        } else {
            bundle = null;
        }
        if (bundle != null && (((Boolean) ((Optional) this.a).orElse(false)).booleanValue() || !bundle.getBoolean("tiktok_accounts_disabled"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0017. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tzq g(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5) {
        /*
            r4 = this;
            int r0 = r5.j()
            r1 = 211(0xd3, float:2.96E-43)
            if (r0 == r1) goto L79
            r1 = 252(0xfc, float:3.53E-43)
            if (r0 == r1) goto L67
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 == r1) goto L61
            r1 = 234(0xea, float:3.28E-43)
            if (r0 == r1) goto L61
            switch(r0) {
                case 200: goto L3f;
                case 201: goto L39;
                case 202: goto L39;
                case 203: goto L33;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 215: goto L61;
                case 216: goto L61;
                case 217: goto L79;
                case 218: goto L79;
                case 219: goto L61;
                case 220: goto L39;
                case 221: goto L39;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 225: goto L3f;
                case 226: goto L33;
                case 227: goto L39;
                case 228: goto L39;
                case 229: goto L33;
                case 230: goto L39;
                case 231: goto L39;
                default: goto L1d;
            }
        L1d:
            int r0 = r5.j()
            boolean r0 = defpackage.tzx.b(r0)
            if (r0 == 0) goto L2d
            tyz r0 = new tyz
            r0.<init>(r5)
            goto L7e
        L2d:
            tzh r0 = new tzh
            r0.<init>(r5)
            goto L7e
        L33:
            tzg r0 = new tzg
            r0.<init>(r5)
            goto L7e
        L39:
            tza r0 = new tza
            r0.<init>(r5)
            goto L7e
        L3f:
            java.lang.Object r0 = r4.a
            java.lang.Object r0 = r0.b()
            rwd r0 = (defpackage.rwd) r0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r5.z()
            long r2 = r5.n()
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r0 = r0.h(r1, r2)
            if (r0 != 0) goto L5b
            tzg r0 = new tzg
            r0.<init>(r5)
            goto L7e
        L5b:
            tza r0 = new tza
            r0.<init>(r5)
            goto L7e
        L61:
            tzo r0 = new tzo
            r0.<init>(r5)
            goto L7e
        L67:
            boolean r0 = defpackage.oic.a()
            if (r0 == 0) goto L73
            tzo r0 = new tzo
            r0.<init>(r5)
            goto L7e
        L73:
            tyz r0 = new tyz
            r0.<init>(r5)
            goto L7e
        L79:
            tzd r0 = new tzd
            r0.<init>(r5)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izc.g(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):tzq");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void h(int i) {
        ((mbl) this.a.b()).e("Bugle.Etouffee.IdentityWorkerParameters.Read", i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void i(int i) {
        ((mbl) this.a.b()).e("Bugle.Etouffee.IdentityWorkerParameters.Write", i);
    }

    public izc(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public izc(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(Context context) {
        context.getClass();
        this.a = context;
    }

    public izc() {
        this.a = new LinkedHashMap();
    }

    public izc(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, byte[] bArr, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public izc(armf armfVar, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
