package defpackage;

import android.content.ClipData;
import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.kids.internal.IParentalControlsListener;
import defpackage.acby;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwj extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwj(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, aeig] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [wh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v81, types: [acby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [dcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [cti, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [cti, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        eov P;
        eov P2;
        long j;
        int i = 5;
        int i2 = 3;
        enb enbVar = null;
        switch (this.c) {
            case 0:
                ?? r6 = this.b;
                zwm zwmVar = (zwm) this.a;
                qjh.l(zwmVar.c, zwmVar.b, new zez(zwmVar, (ResolvedRecipient) r6, (arpe) null, 6, (byte[]) null), 2);
                return arnb.a;
            case 1:
                ?? r0 = this.b;
                zwm zwmVar2 = (zwm) this.a;
                qjh.l(zwmVar2.c, zwmVar2.b, new zez(zwmVar2, (ResolvedRecipient) r0, (arpe) null, 5), 2);
                return arnb.a;
            case 2:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null && (P = enbVar.P()) != null) {
                    return P;
                }
                return ((cg) this.b).P();
            case 3:
                ((zyl) this.a).m.a(this.b);
                return arnb.a;
            case 4:
                ?? r02 = this.b;
                aaya aayaVar = (aaya) this.a;
                qjh.l(aayaVar.l, null, new yhj(aayaVar, (ResolvedRecipient) r02, (arpe) null, 18), 3);
                return arnb.a;
            case 5:
                ?? r03 = this.b;
                aaya aayaVar2 = (aaya) this.a;
                qjh.l(aayaVar2.l, null, new zez(aayaVar2, (ResolvedRecipient) r03, (arpe) null, 8), 3);
                return arnb.a;
            case 6:
                ?? r10 = this.b;
                aaya aayaVar3 = (aaya) this.a;
                qjh.l(aayaVar3.l, null, new zez(aayaVar3, (ResolvedRecipient) r10, (arpe) null, 9, (byte[]) null), 3);
                return arnb.a;
            case 7:
                ((aehz) this.a).j.a();
                ((zfj) ((zzb) this.b).l.b()).a();
                return arnb.a;
            case 8:
                Object ag = aqjn.ag(this.a);
                ag.getClass();
                zzb zzbVar = (zzb) this.b;
                qjh.l(zzbVar.c, null, new yhj(zzbVar, (ResolvedRecipient) ag, (arpe) null, 19), 3);
                return arnb.a;
            case 9:
                ((aehz) this.a).j.a();
                ((zfj) ((zzb) this.b).l.b()).a();
                return arnb.a;
            case 10:
                String str = ((zzf) this.a).c;
                if (str != null) {
                    ?? r1 = this.b;
                    ClipData newPlainText = ClipData.newPlainText(str, str);
                    newPlainText.getClass();
                    r1.b(new dce(newPlainText));
                }
                return arnb.a;
            case 11:
                avc avcVar = (avc) this.a;
                boolean i3 = avcVar.i();
                float f = brg.a;
                if (!i3 && avcVar.b() > 1 && !this.b.a().s()) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 12:
                ((zzl) this.a).b.a(this.b);
                return arnb.a;
            case 13:
                this.b.h(Boolean.valueOf(!((Boolean) this.b.a()).booleanValue()));
                ((duh) this.a).a();
                return arnb.a;
            case 14:
                eoz d2 = dyt.d(this.a);
                if (d2 instanceof enb) {
                    enbVar = (enb) d2;
                }
                if (enbVar != null && (P2 = enbVar.P()) != null) {
                    return P2;
                }
                return ((cg) this.b).P();
            case 15:
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.d = new Feature[]{acbx.a};
                ajxpVar.c();
                ajxpVar.b = 14106;
                ajxpVar.c = new abot(this.a, i2);
                return ((abrc) this.b).g(ajxpVar.b());
            case 16:
                final ?? r04 = this.b;
                IParentalControlsListener.Stub stub = new IParentalControlsListener.Stub() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1
                    @Override // com.google.android.gms.kids.internal.IParentalControlsListener
                    public void onParentalControlsChange(boolean z, int i4) {
                        Integer valueOf;
                        if (z) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(i4);
                        }
                        acby.this.a(valueOf);
                    }
                };
                absy g = abhb.g(this.b, ((abrc) this.a).g, "ParentalControlsListener");
                abte abteVar = new abte();
                abteVar.c = g;
                abteVar.d = new Feature[]{acbx.a};
                abteVar.a();
                abteVar.e = 14107;
                abteVar.a = new abot(stub, 4);
                abteVar.b = new abot(stub, i);
                return ((abrc) this.a).v(abteVar.b());
            case 17:
                ajxp ajxpVar2 = new ajxp(null);
                ajxpVar2.d = new Feature[]{acbx.a};
                ajxpVar2.c();
                ajxpVar2.b = 14110;
                ajxpVar2.c = new abot(this.b, 6);
                return ((abrc) this.a).g(ajxpVar2.b());
            case 18:
                return actx.t(Arrays.asList(((abrc) this.a).h(abhb.f(this.b, "ParentalControlsListener"), 14108)));
            case 19:
                ansl anslVar = new ansl();
                anslVar.c((Context) this.b, "moirai_keyset", "moirai_pref");
                anslVar.b("android-keystore://hades_moirai");
                anslVar.f = ((adzi) this.a).a;
                return anslVar.a().a();
            default:
                arqr e = this.a.e();
                if (e != null) {
                    ?? r12 = this.b;
                    if (r12 != 0 && r12.r()) {
                        j = this.b.k(0L);
                    } else {
                        j = 9205357640488583168L;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwj(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
