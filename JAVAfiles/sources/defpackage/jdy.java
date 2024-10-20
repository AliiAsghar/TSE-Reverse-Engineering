package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdy extends arpw implements arqw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.c = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        switch (this.c) {
            case 0:
                jdy jdyVar = new jdy((arpe) obj3, 0);
                jdyVar.a = (Recipient) obj;
                jdyVar.b = (zzk) obj2;
                return jdyVar.b(arnb.a);
            case 1:
                jdy jdyVar2 = new jdy((arpe) obj3, 1, (byte[]) null);
                jdyVar2.a = (List) obj;
                jdyVar2.b = (mmy) obj2;
                return jdyVar2.b(arnb.a);
            case 2:
                jdy jdyVar3 = new jdy((arpe) obj3, 2, (char[]) null);
                jdyVar3.a = (alog) obj;
                jdyVar3.b = (miu) obj2;
                return jdyVar3.b(arnb.a);
            case 3:
                jdy jdyVar4 = new jdy((arpe) obj3, 3, (short[]) null);
                jdyVar4.a = (armo) obj;
                jdyVar4.b = (afal) obj2;
                return jdyVar4.b(arnb.a);
            case 4:
                jdy jdyVar5 = new jdy((arpe) obj3, 4, (int[]) null);
                jdyVar5.a = (afal) obj;
                jdyVar5.b = (afal) obj2;
                return jdyVar5.b(arnb.a);
            case 5:
                jdy jdyVar6 = new jdy((arpe) obj3, 5, (boolean[]) null);
                jdyVar6.a = (mje) obj;
                jdyVar6.b = (List) obj2;
                return jdyVar6.b(arnb.a);
            case 6:
                jdy jdyVar7 = new jdy((arpe) obj3, 6, (float[]) null);
                jdyVar7.a = (afaw) obj;
                jdyVar7.b = (jzx) obj2;
                return jdyVar7.b(arnb.a);
            case 7:
                jdy jdyVar8 = new jdy((arpe) obj3, 7, (byte[][]) null);
                jdyVar8.a = (agfn) obj;
                jdyVar8.b = (agek) obj2;
                return jdyVar8.b(arnb.a);
            default:
                jdy jdyVar9 = new jdy((arpe) obj3, 8, (char[][]) null);
                jdyVar9.a = (aghk) obj;
                jdyVar9.b = (Duration) obj2;
                return jdyVar9.b(arnb.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5.get(0)).f().z() != false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto Lb7;
                case 1: goto La8;
                case 2: goto L7a;
                case 3: goto L5c;
                case 4: goto L51;
                case 5: goto L44;
                case 6: goto L33;
                case 7: goto L1b;
                default: goto L8;
            }
        L8:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            boolean r0 = r5 instanceof defpackage.aghi
            java.lang.Object r1 = r4.b
            if (r0 == 0) goto Lc7
            aghi r5 = new aghi
            j$.time.Duration r1 = (j$.time.Duration) r1
            r5.<init>(r1)
            return r5
        L1b:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            if (r0 == 0) goto L32
            boolean r2 = r5 instanceof defpackage.agfl
            if (r2 == 0) goto L32
            agfl r5 = (defpackage.agfl) r5
            agek r0 = (defpackage.agek) r0
            r2 = 13
            agfl r5 = defpackage.agfl.a(r5, r1, r0, r2)
        L32:
            return r5
        L33:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            lfp r1 = new lfp
            jzx r0 = (defpackage.jzx) r0
            afaw r5 = (defpackage.afaw) r5
            r1.<init>(r5, r0)
            return r1
        L44:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            armo r1 = new armo
            r1.<init>(r5, r0)
            return r1
        L51:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            if (r0 == 0) goto L5b
            return r0
        L5b:
            return r5
        L5c:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            armo r5 = (defpackage.armo) r5
            java.lang.Object r5 = r5.a
            java.lang.Object r0 = r4.b
            afal r5 = (defpackage.afal) r5
            if (r0 == 0) goto L6c
            r5 = r0
        L6c:
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            armo r1 = new armo
            r1.<init>(r5, r0)
            return r1
        L7a:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            mit r0 = r0.b()
            mit r1 = defpackage.mit.ONE_ON_ONE
            if (r0 != r1) goto La2
            alog r5 = (defpackage.alog) r5
            int r0 = r5.size()
            if (r0 != r2) goto La2
            java.lang.Object r5 = r5.get(r3)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            msh r5 = r5.f()
            boolean r5 = r5.z()
            if (r5 == 0) goto La2
            goto La3
        La2:
            r2 = r3
        La3:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        La8:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            mmy r1 = defpackage.mmy.b
            if (r0 != r1) goto Lb4
            return r5
        Lb4:
            arnv r5 = defpackage.arnv.a
            return r5
        Lb7:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            if (r5 == 0) goto Lc6
            zzk r2 = defpackage.zzk.a
            if (r0 != r2) goto Lc5
            goto Lc6
        Lc5:
            return r5
        Lc6:
            return r1
        Lc7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdy.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, char[] cArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, float[] fArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, int[] iArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, short[] sArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, boolean[] zArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, byte[][] bArr) {
        super(3, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdy(arpe arpeVar, int i, char[][] cArr) {
        super(3, arpeVar);
        this.c = i;
    }
}
