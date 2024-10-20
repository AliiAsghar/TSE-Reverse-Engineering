package defpackage;

import android.net.Uri;
import j$.util.function.BiConsumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vhg implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ vhg(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((vhe) obj2).c();
                return;
            case 1:
                upr uprVar = (upr) obj;
                Long l = (Long) obj2;
                String[] strArr = uqb.a;
                if (l.longValue() >= 0) {
                    uprVar.a = l.longValue();
                    uprVar.fE(0);
                    return;
                }
                return;
            case 2:
                amfq amfqVar = (amfq) obj;
                aozy aozyVar = (aozy) obj2;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfv amfvVar = (amfv) aozyVar.s();
                amfr amfrVar2 = amfr.a;
                amfvVar.getClass();
                amfrVar.B = amfvVar;
                amfrVar.b |= 4194304;
                return;
            case 3:
                ((aozy) obj).w((amfv) obj2);
                return;
            case 4:
                Uri uri = (Uri) obj;
                InputStream inputStream = (InputStream) obj2;
                alvi alviVar = xgw.a;
                try {
                    inputStream.close();
                    return;
                } catch (IOException e) {
                    alvw i = xgw.a.i();
                    i.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri);
                    return;
                }
            case 5:
                aozy aozyVar2 = (aozy) obj;
                amvb amvbVar = (amvb) obj2;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amvq amvqVar = (amvq) aozyVar2.b;
                amvq amvqVar2 = amvq.a;
                amvbVar.getClass();
                amvqVar.d = amvbVar;
                amvqVar.c = 5;
                return;
            case 6:
                aozy aozyVar3 = (aozy) obj;
                amvc amvcVar = (amvc) obj2;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amvq amvqVar3 = (amvq) aozyVar3.b;
                amvq amvqVar4 = amvq.a;
                amvcVar.getClass();
                amvqVar3.d = amvcVar;
                amvqVar3.c = 4;
                return;
            case 7:
                amfq amfqVar2 = (amfq) obj;
                aozy aozyVar4 = (aozy) obj2;
                if (!amfqVar2.b.isMutable()) {
                    amfqVar2.u();
                }
                amfr amfrVar3 = (amfr) amfqVar2.b;
                amvq amvqVar5 = (amvq) aozyVar4.s();
                amfr amfrVar4 = amfr.a;
                amvqVar5.getClass();
                amfrVar3.ay = amvqVar5;
                amfrVar3.e |= 1024;
                return;
            case 8:
                aozy aozyVar5 = (aozy) obj;
                amvf amvfVar = (amvf) obj2;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amvq amvqVar6 = (amvq) aozyVar5.b;
                amvq amvqVar7 = amvq.a;
                amvfVar.getClass();
                amvqVar6.d = amvfVar;
                amvqVar6.c = 6;
                return;
            case 9:
                aozy aozyVar6 = (aozy) obj;
                amvh amvhVar = (amvh) obj2;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                amvq amvqVar8 = (amvq) aozyVar6.b;
                amvq amvqVar9 = amvq.a;
                amvhVar.getClass();
                amvqVar8.d = amvhVar;
                amvqVar8.c = 3;
                return;
            case 10:
                aozy aozyVar7 = (aozy) obj;
                amvn amvnVar = (amvn) obj2;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                amvq amvqVar10 = (amvq) aozyVar7.b;
                amvq amvqVar11 = amvq.a;
                amvnVar.getClass();
                amvqVar10.d = amvnVar;
                amvqVar10.c = 2;
                return;
            case 11:
                aozy aozyVar8 = (aozy) obj;
                amve amveVar = (amve) obj2;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                amvq amvqVar12 = (amvq) aozyVar8.b;
                amvq amvqVar13 = amvq.a;
                amveVar.getClass();
                amvqVar12.d = amveVar;
                amvqVar12.c = 8;
                return;
            case 12:
                aozy aozyVar9 = (aozy) obj;
                amvk amvkVar = (amvk) obj2;
                if (!aozyVar9.b.isMutable()) {
                    aozyVar9.u();
                }
                amvq amvqVar14 = (amvq) aozyVar9.b;
                amvq amvqVar15 = amvq.a;
                amvkVar.getClass();
                amvqVar14.d = amvkVar;
                amvqVar14.c = 9;
                return;
            case 13:
                aozy aozyVar10 = (aozy) obj;
                amvp amvpVar = (amvp) obj2;
                if (!aozyVar10.b.isMutable()) {
                    aozyVar10.u();
                }
                amvq amvqVar16 = (amvq) aozyVar10.b;
                amvq amvqVar17 = amvq.a;
                amvpVar.getClass();
                amvqVar16.d = amvpVar;
                amvqVar16.c = 10;
                return;
            case 14:
                aozy aozyVar11 = (aozy) obj;
                amvi amviVar = (amvi) obj2;
                if (!aozyVar11.b.isMutable()) {
                    aozyVar11.u();
                }
                amvq amvqVar18 = (amvq) aozyVar11.b;
                amvq amvqVar19 = amvq.a;
                amviVar.getClass();
                amvqVar18.d = amviVar;
                amvqVar18.c = 13;
                return;
            case 15:
                aozy aozyVar12 = (aozy) obj;
                amvj amvjVar = (amvj) obj2;
                if (!aozyVar12.b.isMutable()) {
                    aozyVar12.u();
                }
                amvq amvqVar20 = (amvq) aozyVar12.b;
                amvq amvqVar21 = amvq.a;
                amvjVar.getClass();
                amvqVar20.d = amvjVar;
                amvqVar20.c = 11;
                return;
            case 16:
                aozy aozyVar13 = (aozy) obj;
                amvo amvoVar = (amvo) obj2;
                if (!aozyVar13.b.isMutable()) {
                    aozyVar13.u();
                }
                amvq amvqVar22 = (amvq) aozyVar13.b;
                amvq amvqVar23 = amvq.a;
                amvoVar.getClass();
                amvqVar22.d = amvoVar;
                amvqVar22.c = 12;
                return;
            case 17:
                aozy aozyVar14 = (aozy) obj;
                amvd amvdVar = (amvd) obj2;
                if (!aozyVar14.b.isMutable()) {
                    aozyVar14.u();
                }
                amvq amvqVar24 = (amvq) aozyVar14.b;
                amvq amvqVar25 = amvq.a;
                amvdVar.getClass();
                amvqVar24.d = amvdVar;
                amvqVar24.c = 14;
                return;
            case 18:
                amfq amfqVar3 = (amfq) obj;
                aozy aozyVar15 = (aozy) obj2;
                if (!amfqVar3.b.isMutable()) {
                    amfqVar3.u();
                }
                amfr amfrVar5 = (amfr) amfqVar3.b;
                amnl amnlVar = (amnl) aozyVar15.s();
                amfr amfrVar6 = amfr.a;
                amnlVar.getClass();
                amfrVar5.q = amnlVar;
                amfrVar5.b |= 512;
                return;
            case 19:
                ((aozy) obj).w((amnl) obj2);
                return;
            default:
                aozy aozyVar16 = (aozy) obj;
                amtr amtrVar = (amtr) obj2;
                if (!aozyVar16.b.isMutable()) {
                    aozyVar16.u();
                }
                amtp amtpVar = (amtp) aozyVar16.b;
                amtp amtpVar2 = amtp.a;
                amtrVar.getClass();
                amtpVar.c = amtrVar;
                amtpVar.b = 2;
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 1:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 2:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 3:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 4:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 5:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 6:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 7:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 8:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 9:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 10:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 11:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 12:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 13:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 14:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 15:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 16:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 17:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 18:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 19:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }
}
