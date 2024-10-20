package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.ims.SipMessage;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardBuilder;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.csv;
import defpackage.cwl;
import defpackage.dhv;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adcx {
    public adcx(char[] cArr) {
    }

    public static aefg A(aozb aozbVar) {
        int i = ambp.a;
        ambj a = ambn.a.a(aozbVar.o());
        byte[] bArr = new byte[16];
        int ct = albo.ct(16, a.b() / 8);
        albo.S(0, ct, 16);
        a.g(bArr, ct);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new aefg(order.getInt(), order.getInt(), order.getInt(), order.getInt());
    }

    public static Data B(arqr arqrVar) {
        Data data = new Data();
        arqrVar.a(data);
        return data;
    }

    public static void C(Data data, String str, arqr arqrVar) {
        data.putData(str, B(arqrVar));
    }

    public static /* synthetic */ aecs D(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aecs) s;
    }

    public static void E(aecm aecmVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecs aecsVar = (aecs) aozyVar.b;
        aecs aecsVar2 = aecs.a;
        aecsVar.d = aecmVar;
        aecsVar.b |= 2;
    }

    public static void F(aozn aoznVar, aozy aozyVar) {
        aoznVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecs aecsVar = (aecs) aozyVar.b;
        aecs aecsVar2 = aecs.a;
        aecsVar.c = aoznVar;
        aecsVar.b |= 1;
    }

    public static aecm G(aozy aozyVar) {
        aecm aecmVar = ((aecq) aozyVar.b).c;
        if (aecmVar == null) {
            aecmVar = aecm.a;
        }
        aecmVar.getClass();
        return aecmVar;
    }

    public static /* synthetic */ aecq H(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aecq) s;
    }

    public static void I(aecm aecmVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecq aecqVar = (aecq) aozyVar.b;
        aecq aecqVar2 = aecq.a;
        aecqVar.c = aecmVar;
        aecqVar.b |= 1;
    }

    public static /* synthetic */ void J(aecs aecsVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecq aecqVar = (aecq) aozyVar.b;
        aecq aecqVar2 = aecq.a;
        apax apaxVar = aecqVar.d;
        if (!apaxVar.c()) {
            aecqVar.d = apag.mutableCopy(apaxVar);
        }
        aecqVar.d.add(aecsVar);
    }

    public static /* synthetic */ aecm L(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aecm) s;
    }

    public static void M(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecm aecmVar = (aecm) aozyVar.b;
        aecm aecmVar2 = aecm.a;
        aecmVar.b |= 2;
        aecmVar.d = z;
    }

    public static void N(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecm aecmVar = (aecm) aozyVar.b;
        aecm aecmVar2 = aecm.a;
        aecmVar.b |= 4;
        aecmVar.e = false;
    }

    public static void O(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aecm aecmVar = (aecm) aozyVar.b;
        aecm aecmVar2 = aecm.a;
        aecmVar.c = i - 1;
        aecmVar.b |= 1;
    }

    public static int P(aecg aecgVar) {
        int ordinal = aecgVar.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal == 1) {
            return 4;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 1;
        }
        if (ordinal == 4) {
            return 2;
        }
        if (ordinal == 5) {
            return 6;
        }
        throw new armm();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r11.equals("NOT_AVAILABLE") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r11.equals("NONE") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r11.equals("PHISHING") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r11.equals("GIFT_CARD") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r11.equals("NOT_SUPPORTED") != false) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: IllegalArgumentException -> 0x00a1, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x00a1, blocks: (B:29:0x004f, B:35:0x009b, B:36:0x00a0), top: B:28:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int Q(java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            r1 = 7
            java.lang.String r2 = "SUSPICIOUS"
            java.lang.String r3 = "PHISHING"
            java.lang.String r4 = "GIFT_CARD"
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            switch(r0) {
                case -908719937: goto L46;
                case -664540516: goto L3d;
                case 2402104: goto L32;
                case 140722205: goto L27;
                case 618719069: goto L1f;
                case 854821378: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            java.lang.String r0 = "NOT_SUPPORTED"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L4e
        L1c:
            r1 = r5
            goto La2
        L1f:
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L4e
            goto La2
        L27:
            java.lang.String r0 = "NOT_AVAILABLE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L4e
        L2f:
            r1 = r6
            goto La2
        L32:
            java.lang.String r0 = "NONE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L4e
        L3a:
            r1 = r7
            goto La2
        L3d:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L4e
        L43:
            r1 = r8
            goto La2
        L46:
            boolean r0 = r11.equals(r4)
            if (r0 == 0) goto L4e
        L4c:
            r1 = r9
            goto La2
        L4e:
            r0 = 1
            int r10 = r11.hashCode()     // Catch: java.lang.IllegalArgumentException -> La1
            switch(r10) {
                case -1188400723: goto L8d;
                case -908719937: goto L85;
                case -664540516: goto L7d;
                case -99211486: goto L73;
                case 343993882: goto L69;
                case 618719069: goto L61;
                case 1080303862: goto L57;
                default: goto L56;
            }
        L56:
            goto L97
        L57:
            java.lang.String r2 = "NO_POLICY_VIOLATION"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L97
            r11 = r0
            goto L98
        L61:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L97
            r11 = r8
            goto L98
        L69:
            java.lang.String r2 = "NOT_AVAILABLE_POLICY_VIOLATION"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L97
            r11 = r5
            goto L98
        L73:
            java.lang.String r2 = "UNSUPPORTED_POLICY_VIOLATION"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L97
            r11 = r7
            goto L98
        L7d:
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L97
            r11 = r9
            goto L98
        L85:
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L97
            r11 = r6
            goto L98
        L8d:
            java.lang.String r2 = "UNKNOWN_POLICY_VIOLATION"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L97
            r11 = 0
            goto L98
        L97:
            r11 = -1
        L98:
            switch(r11) {
                case 0: goto La1;
                case 1: goto L3a;
                case 2: goto L1c;
                case 3: goto L2f;
                case 4: goto L4c;
                case 5: goto L43;
                case 6: goto La2;
                default: goto L9b;
            }
        L9b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La1
            r11.<init>()     // Catch: java.lang.IllegalArgumentException -> La1
            throw r11     // Catch: java.lang.IllegalArgumentException -> La1
        La1:
            r1 = r0
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.Q(java.lang.String):int");
    }

    public static Data R(aebp aebpVar) {
        aebpVar.getClass();
        return B(new aaji(aebpVar, 11));
    }

    public static aebp S(hzl hzlVar) {
        hzlVar.getClass();
        return new aebq(hzlVar, 13);
    }

    public static /* synthetic */ Object T(aebl aeblVar, boolean z, arpe arpeVar, int i) {
        boolean z2 = true;
        if (1 != ((z ? 1 : 0) & ((i & 1) ^ 1))) {
            z2 = false;
        }
        return arwi.d(new jmw(z2, aeblVar, (arpe) null, 12), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object U(defpackage.aday r16, defpackage.aecj r17, java.util.Map r18, defpackage.aozb r19, int r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.U(aday, aecj, java.util.Map, aozb, int, arpe):java.lang.Object");
    }

    public static void V(aeyp aeypVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        aeypVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(1986367642);
        if (i4 == 0) {
            if (true != c.G(aeypVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aexq(aeypVar, i, 7);
                return;
            }
            return;
        }
        cga.a aVar = cga.e;
        throw null;
    }

    public static void W(aeyo aeyoVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1188894782);
        if (i4 == 0) {
            if (true != c.G(aeyoVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            int i5 = cfq.a;
            cue a = akc.a(cfq.a.e, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            akf akfVar = akf.a;
            ahji.N(aeke.bg(aerb.ap, c), null, amv.h(cga.e, 24.0f), ckw.c(aeyoVar.b), c, 392, 0);
            cga a3 = akfVar.a(cga.e, cfq.a.e);
            adom.cq(String.valueOf(aeyoVar.a), a3, ckw.c(aeyoVar.b), new dqi(3), 0, 0, dje.y(bmp.d(c).n, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), c, 0, 48);
            c.p();
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aeyoVar, cgaVar2, i, 6, null);
        }
    }

    public static void X(aeyn aeynVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1078980653);
        if (i4 == 0) {
            if (true != c.G(aeynVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.ad(aeynVar.c, cdk.e(649153024, new aeyl(aeynVar, 1), c), null, false, cdk.e(-871497571, new aeyl(aeynVar, 0), c), null, null, null, null, null, c, 196998, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aeynVar, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Y(defpackage.bwj r23, int r24) {
        /*
            r0 = 386306362(0x1706913a, float:4.3481037E-25)
            r1 = r23
            bwj r0 = r1.c(r0)
            if (r24 != 0) goto L19
            boolean r1 = r0.L()
            r2 = 0
            if (r1 != 0) goto L15
            r22 = r2
            goto L1b
        L15:
            r0.v()
            goto L58
        L19:
            r22 = r24
        L1b:
            cga$a r1 = defpackage.cga.e
            r5 = 0
            r6 = 11
            r2 = 0
            r3 = 0
            r4 = 1086324736(0x40c00000, float:6.0)
            cga r2 = defpackage.amh.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132021444(0x7f1410c4, float:1.968128E38)
            java.lang.String r1 = defpackage.dga.a(r1, r0)
            blh r3 = defpackage.bmp.a(r0)
            long r3 = r3.q
            bse r5 = defpackage.bmp.d(r0)
            dje r5 = r5.k
            r17 = r5
            r20 = 0
            r21 = 65528(0xfff8, float:9.1824E-41)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 48
            r18 = r0
            defpackage.ahji.e(r1, r2, r3, r5, r7, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = r22
        L58:
            bzz r0 = r0.e()
            if (r0 == 0) goto L69
            aerz r1 = new aerz
            r3 = 10
            r1.<init>(r2, r3)
            bzf r0 = (defpackage.bzf) r0
            r0.d = r1
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.Y(bwj, int):void");
    }

    public static void Z(aeym aeymVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1683586570);
        if (i5 == 0) {
            if (true != c.G(aeymVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga j = amh.j(adf.b(amv.q(amv.p(cgaVar), 48.0f, brg.a, 2), bmp.a(c).F), 20.0f, brg.a, 16.0f, brg.a, 10);
            int i6 = cfq.a;
            cue a = amq.a(ajw.a, cfq.a.k, c, 48);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            Y(c, 0);
            X(aeymVar.a, c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aeymVar, cgaVar, i, 5, null);
        }
    }

    public static void aA(ake akeVar, aexi aexiVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(594215712);
        boolean z = true;
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aexiVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aevh aevhVar = new aevh(aexiVar.c, aexiVar.d);
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            cga a = akeVar.a(aVar, cfq.a.e);
            aexh aexhVar = aexiVar.a;
            if (aexiVar.b == null) {
                z = false;
            }
            aE(aexhVar, a, z, c, 3072);
            bD(aevhVar, akeVar.a(amh.d(cga.e, 12.0f), cfq.a.g), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(akeVar, aexiVar, i, 20);
        }
    }

    public static void aB(ake akeVar, aexj aexjVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1969352288);
        int i6 = 2;
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aexjVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aevg aevgVar = new aevg(aexjVar.b, new aevf(true), i6);
            cga.a aVar = cga.e;
            int i7 = cfq.a;
            ax(aexjVar.a, akeVar.a(aVar, cfq.a.e), bmp.a(c).q, false, c, 3072, 0);
            bD(aevgVar, akeVar.a(amh.d(cga.e, 12.0f), cfq.a.g), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(akeVar, aexjVar, i, 1);
        }
    }

    public static void aC(ake akeVar, aexl aexlVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(835759556);
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aexlVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            long h = cku.h(cku.a, 0.3f);
            long j = cku.d;
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            ax(aexh.b, akeVar.a(aVar, cfq.a.e), j, false, c, 390, 8);
            String str = aexlVar.a;
            if (str != null) {
                bqv.c(akeVar.a(amh.d(cga.e, 12.0f), cfq.a.i), awh.a, h, 0L, brg.a, brg.a, null, cdk.e(-1307453731, new aevc(str, j, 2), c), c, 120);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(akeVar, aexlVar, i, 0);
        }
    }

    public static void aD(ake akeVar, aexm aexmVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(2092948408);
        boolean z = true;
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aexmVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            Float f2 = aexmVar.c;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = Float.POSITIVE_INFINITY;
            }
            aevk aevkVar = new aevk(Float.valueOf(f), aexmVar.d);
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            cga a = akeVar.a(aVar, cfq.a.e);
            aexh aexhVar = aexmVar.a;
            if (aexmVar.b == null) {
                z = false;
            }
            aE(aexhVar, a, z, c, 3072);
            bD(aevkVar, akeVar.a(amh.d(cga.e, 12.0f), cfq.a.g), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(akeVar, aexmVar, i, 2);
        }
    }

    public static void aE(aexh aexhVar, cga cgaVar, boolean z, bwj bwjVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-1050992813);
        if (i7 == 0) {
            if (true != c.G(aexhVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(false)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            c.y(-255594381);
            if (z) {
                j = cku.d;
            } else {
                j = ((cku) c.g(blp.a)).i;
            }
            ((bwk) c).Y();
            ax(aexhVar, cgaVar, j, false, c, i2 & 7294, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aexhVar, cgaVar, z, i, 16);
        }
    }

    public static void aF(aext aextVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(138173436);
        if (i5 == 0) {
            if (true != c.G(aextVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aG(cx(amv.p(cgaVar), aextVar.c, c), cdk.e(-949122419, new aelu(aextVar, 20), c), c, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aextVar, cgaVar, i, 16);
        }
    }

    public static void aG(cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(414303463);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ahji.ag(cgaVar, null, null, null, null, arqwVar, c, (i2 & 14) | ((i2 << 12) & 458752));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(cgaVar, arqwVar, i, 18);
        }
    }

    public static void aH(aexv aexvVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        aexvVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1415994756);
        if (i5 == 0) {
            if (true != c.G(aexvVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(-642387728);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aanv(aexvVar, (arpe) null, 20);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.g(aexvVar, (arqv) T, c);
            if (aexvVar instanceof aexu) {
                c.y(-642385359);
                aI((aexu) aexvVar, cgaVar, c, i2 & 112);
                bwkVar.Y();
            } else if (aexvVar instanceof aext) {
                c.y(-642382477);
                aF((aext) aexvVar, cgaVar, c, i2 & 112);
                bwkVar.Y();
            } else {
                c.y(-642386782);
                bwkVar.Y();
                throw new armm();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aexvVar, cgaVar, i, 19);
        }
    }

    public static void aI(aexu aexuVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(183787836);
        if (i5 == 0) {
            if (true != c.G(aexuVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aG(cx(amv.t(cgaVar, brg.a, 480.0f, 1), aexuVar.c, c), cdk.e(819822669, new aeyj(aexuVar, 1), c), c, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aexuVar, cgaVar, i, 3, null);
        }
    }

    public static /* synthetic */ cga aJ(cga cgaVar, boolean z, bwj bwjVar) {
        bwjVar.y(454748592);
        if (z) {
            cgaVar = adf.b(cga.e, cku.h(bmp.a(bwjVar).a, 0.3f));
        }
        bwjVar.q();
        return cgaVar;
    }

    public static void aK(aexa aexaVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-376240132);
        if (i4 == 0) {
            if (true != c.G(aexaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            afv b = afs.b(c, 0);
            int i5 = aexaVar.f;
            cga a = alw.a(afs.a(cgaVar, b), alx.a);
            boolean z = aexaVar.b;
            c.y(509840176);
            if (z) {
                a = a.a(adf.b(cga.e, cku.h(bmp.a(c).a, 0.3f)));
            }
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            String str = aexaVar.e;
            c.y(-1816743994);
            cga a2 = a.a(aetn.aQ(cga.e, str));
            bwkVar.Y();
            ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
            int i6 = cfq.a;
            cue a3 = amq.a(dVar, cfq.a.j, c, 6);
            int a4 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a2);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            c.y(530768608);
            Iterator it = aexaVar.a.iterator();
            while (it.hasNext()) {
                if (i5 == 120) {
                    f = 224.0f;
                } else {
                    f = 344.0f;
                }
                aH((aexu) it.next(), amv.n(amv.e(amv.l(cga.e, aexaVar.f), 112.0f, f)), c, 0);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aexaVar, cgaVar, i, 15);
        }
    }

    public static void aL(cga cgaVar, aewx aewxVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1594277986);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aewxVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            amh.i(amv.t(cgaVar, brg.a, 412.0f, 1), 16.0f, brg.a, 2);
            c.y(-971138627);
            aN(cgaVar, aewxVar.c, arqwVar, c, i2 & 910);
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(cgaVar, aewxVar, arqwVar, i, 9, (byte[]) null);
        }
    }

    public static void aM(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(2070942394);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, amh.i(cgaVar, 24.0f, brg.a, 2), bmp.a(c).s, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, bmp.d(c).k, bwjVar2, i6 & 14, 0, 65016);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) str, cgaVar, i, 14);
        }
    }

    public static void aN(cga cgaVar, arqg arqgVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1684220430);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i7 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i8 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cmb cmbVar = clw.a;
            bku aj = ahji.aj(cku.g, c, 14);
            c.y(1533722993);
            int i9 = 14 & (i2 >> 3);
            int i10 = (i2 << 3) & 112;
            ahji.ah(arqgVar, cgaVar, false, cmbVar, aj, null, null, arqwVar, c, ((i2 << 18) & 234881024) | i9 | 3072 | i10);
            bwkVar.Y();
            ahji.V(chw.a(cga.e, 1.0f, null, 0L, 0L, 30), brg.a, 0L, c, 6, 6);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(cgaVar, arqgVar, arqwVar, i, 10, (byte[]) null);
        }
    }

    public static void aO(aewx aewxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-39517062);
        if (i5 == 0) {
            if (true != c.G(aewxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = (i2 >> 3) & 14;
            aL(cgaVar, aewxVar, cdk.e(865808086, new aelu(aewxVar, 19), c), c, ((i2 << 3) & 112) | i6 | 384);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aewxVar, cgaVar, i, 13);
        }
    }

    public static void aP(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        bwj c = bwjVar.c(-1780171373);
        if ((i & 14) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            bqv.c(cgaVar, awh.a(16.0f), cku.g, 0L, brg.a, brg.a, ads.a(1.0f, bmp.a(c).A), aewu.a, c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 16);
        }
    }

    public static cga aQ(cga cgaVar, cku ckuVar, cku ckuVar2, boolean z) {
        cgaVar.getClass();
        return cfv.d(cgaVar, "com.google.android.libraries.communications.ux.components.placeholder.defaultPlaceholder", ckuVar, ckuVar2, new agib(ckuVar2, ckuVar, z, 1));
    }

    public static cln aR(cny cnyVar, cmb cmbVar, long j, aewn aewnVar, float f, cln clnVar, drk drkVar, cjt cjtVar) {
        cln clnVar2 = null;
        if (cmbVar == clw.a) {
            cnw.l(cnyVar, j, 0L, 0L, brg.a, null, 126);
            cnw.k(cnyVar, aewnVar.c(f, cnyVar.o()), 0L, 0L, aewnVar.a(f), null, 118);
            return null;
        }
        if (cjt.e(cnyVar.o(), cjtVar) && cnyVar.r() == drkVar) {
            clnVar2 = clnVar;
        }
        if (clnVar2 == null) {
            clnVar2 = cmbVar.a(cnyVar.o(), cnyVar.r(), cnyVar);
        }
        clo.b(cnyVar, clnVar2, j);
        clo.a(cnyVar, clnVar2, aewnVar.c(f, cnyVar.o()), aewnVar.a(f));
        return clnVar2;
    }

    public static /* synthetic */ aewn aS(long j, bwj bwjVar) {
        bwjVar.y(-830956014);
        arml armlVar = aewm.a;
        aaw aawVar = (aaw) aewm.b.a();
        aawVar.getClass();
        aewq aewqVar = new aewq(j, aawVar);
        bwjVar.q();
        return aewqVar;
    }

    public static /* synthetic */ cga aT(cga cgaVar, cku ckuVar, int i) {
        if (1 == (i & 1)) {
            ckuVar = null;
        }
        return aQ(cgaVar, ckuVar, null, false);
    }

    public static void aU(aewk aewkVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-2069053281);
        if (i4 == 0) {
            if (true != c.G(aewkVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            c.y(-2058918165);
            int i6 = i5 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new aanv(aewkVar, (arpe) null, 19);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bxl.g(aewkVar, (arqv) T, c);
            if (aewkVar instanceof aewj) {
                c.y(-2058915449);
                aW(cgaVar, (aewj) aewkVar, c, (i5 >> 3) & 14);
                bwkVar.Y();
            } else if (aewkVar instanceof aewi) {
                c.y(-2058912572);
                aV(cgaVar, (aewi) aewkVar, c, (i5 >> 3) & 14);
                bwkVar.Y();
            } else {
                c.y(-2058917187);
                bwkVar.Y();
                throw new armm();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aewkVar, cgaVar, i, 10);
        }
    }

    public static void aV(cga cgaVar, aewi aewiVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-2084979778);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aewiVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cu(amv.h(cgaVar, 48.0f), amv.o(cga.e), brg.a, aeke.bg(aewiVar.b, c), dga.a(R.string.pending_bubble_retry_button_content_description, c), 0L, aewiVar.a, c, 4144, 36);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(cgaVar, aewiVar, i, 11);
        }
    }

    public static void aW(cga cgaVar, aewj aewjVar, bwj bwjVar, int i) {
        int i2;
        arnb arnbVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1211794698);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aewjVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = cfq.a;
            cue a = akc.a(cfq.a.e, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cu(amv.h(cga.e, 24.0f), null, brg.a, aeke.bg(aerb.ac, c), dga.a(R.string.pending_bubble_cancel_button_content_description, c), 0L, aewjVar.b, c, 4102, 38);
            Float f = aewjVar.a;
            c.y(690763598);
            if (f == null) {
                arnbVar = null;
            } else {
                float floatValue = f.floatValue();
                bog.e(floatValue, aetn.aQ(amv.h(cga.e, 36.0f), dga.b(R.string.pending_bubble_finite_spinner_content_description, new Object[]{Integer.valueOf((int) (100.0f * floatValue))}, c)), 0L, brg.a, bmp.a(c).c, 0, c, 0);
                arnbVar = arnb.a;
            }
            bwkVar.Y();
            c.y(690763059);
            if (arnbVar == null) {
                bog.a(aetn.aQ(amv.h(cga.e, 36.0f), dga.a(R.string.pending_bubble_infinite_spinner_content_description, c)), 0L, brg.a, bmp.a(c).c, 0, brg.a, c, 0, 54);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(cgaVar, aewjVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aX(defpackage.aewe r13, defpackage.cga r14, int r15, boolean r16, defpackage.bwj r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.aX(aewe, cga, int, boolean, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aY(defpackage.cga r13, defpackage.aewd r14, defpackage.arqw r15, defpackage.bwj r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.aY(cga, aewd, arqw, bwj, int, int):void");
    }

    public static void aZ(arqv arqvVar, arqv arqvVar2, float f, cga cgaVar, aewd aewdVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        arqvVar.getClass();
        arqvVar2.getClass();
        int i8 = i & 14;
        bwj c = bwjVar.c(-1238085463);
        if (i8 == 0) {
            if (true != c.I(arqvVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar2)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.D(f)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(aewdVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            float cy = cy(f);
            c.y(-1518019052);
            cga a = chk.a(ajz.b(amv.v(cgaVar, null, 3)), cz(aewdVar));
            int i9 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i10 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar3);
            }
            caw.b(c, b, cwl.a.c);
            cga o = amv.o(cga.e);
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, o);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar4 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar4);
            }
            caw.b(c, b2, cwl.a.c);
            amu amuVar = amu.a;
            cga a6 = ams.a(amuVar, cga.e, cy);
            cue a7 = akc.a(cfq.a.a, false);
            int a8 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b3 = cfv.b(c, a6);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a7, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar5 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar5);
            }
            caw.b(c, b3, cwl.a.c);
            arqvVar.a(c, Integer.valueOf(i2 & 14));
            c.p();
            amx.a(ams.a(amuVar, cga.e, f), c);
            cga a9 = ams.a(amuVar, cga.e, cy);
            cue a10 = akc.a(cfq.a.a, false);
            int a11 = bwg.a(c);
            byx P4 = bwkVar.P();
            cga b4 = cfv.b(c, a9);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a10, cwl.a.e);
            caw.b(c, P4, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar6);
            }
            caw.b(c, b4, cwl.a.c);
            arqvVar2.a(c, Integer.valueOf((i2 >> 3) & 14));
            c.p();
            c.p();
            c.p();
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeoy(arqvVar, arqvVar2, f, cgaVar, aewdVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void aa(defpackage.bwj r9, int r10) {
        /*
            r0 = -1869127044(0xffffffff9097627c, float:-5.971074E-29)
            bwj r9 = r9.c(r0)
            if (r10 != 0) goto L16
            boolean r10 = r9.L()
            r0 = 0
            if (r10 != 0) goto L12
            r10 = r0
            goto L16
        L12:
            r9.v()
            goto L2c
        L16:
            aerb r0 = defpackage.aerb.o
            cor r1 = defpackage.aeke.bg(r0, r9)
            blh r0 = defpackage.bmp.a(r9)
            long r4 = r0.q
            r7 = 56
            r8 = 4
            r2 = 0
            r3 = 0
            r6 = r9
            defpackage.ahji.N(r1, r2, r3, r4, r6, r7, r8)
            r0 = r10
        L2c:
            bzz r9 = r9.e()
            if (r9 == 0) goto L3d
            aerz r10 = new aerz
            r1 = 9
            r10.<init>(r0, r1)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r10
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.aa(bwj, int):void");
    }

    public static void ab(boolean z, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(112078769);
        if (i5 == 0) {
            if (true != c.H(z)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga cgaVar = cga.e;
            if (z) {
                cgaVar = amv.d(cga.e, 36.0f);
            }
            if (!z) {
                cgaVar = cgaVar.a(amv.h(cga.e, 44.0f));
            }
            if (z) {
                cgaVar = cgaVar.a(amh.i(cga.e, 16.0f, brg.a, 2));
            }
            ajw.c cVar = ajw.e;
            int i6 = cfq.a;
            int i7 = ((i2 << 6) & 7168) | 432;
            cue a = amq.a(cVar, cfq.a.k, c, 54);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            arqwVar.a(amu.a, c, Integer.valueOf(((i7 >> 6) & 112) | 6));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(z, arqwVar, i, 13);
        }
    }

    public static void ac(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(982574239);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(str, null, bmp.a(c).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).m, bwjVar2, i2 & 14, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aexq(str, i, 5);
        }
    }

    public static void ad(aeyk aeykVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        aeykVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-161639777);
        if (i5 == 0) {
            if (true != c.G(aeykVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ae(cgaVar, aeykVar.a, aeykVar.b, aeykVar.e, cdk.e(-1895237751, new aeqh(aeykVar, 20), c), c, ((i2 >> 3) & 14) | 196608);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aeykVar, cgaVar, i, 4, null);
        }
    }

    public static void ae(cga cgaVar, boolean z, String str, arqg arqgVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        float f;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c = bwjVar.c(-992314483);
        if (i9 == 0) {
            if (true != c.G(cgaVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.H(false)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(str)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((i2 & 374491) == 74898 && c.L()) {
            c.v();
        } else {
            if (true != z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            cas c2 = zl.c(f, null, null, c, 0, 30);
            c.y(-1687758434);
            boolean G = c.G(c2);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new aeql(c2, 18);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga i10 = amh.i(aetn.aQ(wj.b(cld.a(cgaVar, (arqr) T)), str), 1.0f, brg.a, 2);
            c.y(-780583918);
            boolean cc = adom.cc(c);
            c.y(-628805689);
            if (cc) {
                c.y(77941349);
                j = bmp.a(c).G;
                bwkVar.Y();
            } else {
                c.y(78002450);
                j = bmp.a(c).p;
                bwkVar.Y();
            }
            bwkVar.Y();
            bwkVar.Y();
            bqv.d(arqgVar, i10, false, awh.a, j, 0L, 1.0f, null, null, arqvVar, c, 868);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeod(cgaVar, z, str, arqgVar, arqvVar, i, 5);
        }
    }

    public static cga af(cga cgaVar, aov aovVar, arqr arqrVar, aeyi aeyiVar, arqg arqgVar) {
        cgaVar.getClass();
        aovVar.getClass();
        return cfv.c(cgaVar, "com.google.android.libraries.communications.ux.components.scrollbar.scrollbar", aovVar, arqrVar, aeyiVar, new aeyh(aovVar, aeyiVar, arqrVar, arqgVar));
    }

    public static void ag(aeye aeyeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(181274209);
        if (i4 == 0) {
            if (true != c.G(aeyeVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga a = chk.a(amv.g(cga.e, 40.0f), bmp.c(c).c);
            if (aeyeVar instanceof aeya) {
                c.y(1591313706);
                cga b = adf.b(chk.a(amv.g(cga.e, 40.0f), awh.a), bmp.a(c).a);
                int i5 = cfq.a;
                cue a2 = akc.a(cfq.a.e, false);
                int a3 = bwg.a(c);
                bwk bwkVar = (bwk) c;
                byx P = bwkVar.P();
                cga b2 = cfv.b(c, b);
                int i6 = cwl.a;
                arqg arqgVar = cwl.a.a;
                c.A();
                if (bwkVar.y) {
                    c.l(arqgVar);
                } else {
                    c.C();
                }
                caw.b(c, a2, cwl.a.e);
                caw.b(c, P, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwkVar.ad(valueOf);
                    c.j(valueOf, arqvVar);
                }
                caw.b(c, b2, cwl.a.c);
                ahji.N(aeke.bg(((aeya) aeyeVar).a, c), null, dea.a(amh.j(cga.e, brg.a, 8.0f, brg.a, 8.0f, 5), "snippet_icon_thumbnail"), bmp.a(c).b, c, 392, 0);
                c.p();
                bwkVar.Y();
            } else if (aeyeVar instanceof aeyb) {
                c.y(2086592381);
                Uri uri = ((aeyb) aeyeVar).a;
                int i7 = csv.a;
                aeke.bf(uri, "", a, null, null, null, csv.a.a, null, brg.a, null, null, null, "snippet_image_thumbnail", null, null, null, c, 12582968, 196608, 491384);
                ((bwk) c).Y();
            } else if (!(aeyeVar instanceof aeyc)) {
                if (aeyeVar instanceof aeyd) {
                    c.y(2087026877);
                    Uri uri2 = ((aeyd) aeyeVar).a;
                    int i8 = csv.a;
                    aeke.bf(uri2, "", a, null, null, null, csv.a.a, null, brg.a, null, null, null, "snippet_video_thumbnail", null, null, null, c, 12582968, 196608, 491384);
                    ((bwk) c).Y();
                } else {
                    c.y(1591312702);
                    ((bwk) c).Y();
                    throw new armm();
                }
            } else {
                c.y(2086849712);
                dea.a(amv.g(cga.e, 40.0f), "snippet_monogram_thumbnail");
                throw null;
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aeyeVar, i, 4);
        }
    }

    public static void ah(String str, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(-43139658);
        if ((i & 14) == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(true)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            ahji.e(str, amv.u(cga.e), bmp.a(c).s, 0L, 0L, null, 0L, 2, false, 4, 0, null, bmp.d(c).k, c, i5 & 14, 48, 55288);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(str, false, i, 11, null);
        }
    }

    public static void ai(String str, String str2, boolean z, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        bwj c = bwjVar.c(-2119024079);
        if ((i & 14) == 0) {
            if (true != c.G(str)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str2)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.H(true)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146 && c.L()) {
            c.v();
        } else {
            int i7 = i3 >> 3;
            int i8 = i7 & 112;
            cga.a aVar = cga.e;
            cga q = amv.q(cga.e, 40.0f, brg.a, 2);
            ajw.c cVar = ajw.e;
            int i9 = cfq.a;
            cue a = akk.a(cVar, cfq.a.m, c, 6);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, q);
            int i10 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            c.y(-997502879);
            aj(str, true, c, (i3 & 14) | i8);
            bwkVar.Y();
            ah(str2, true, c, i7 & 126);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetm(str, str2, true, i, 0, 4);
        }
    }

    public static void aj(String str, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(-849233072);
        if ((i & 14) == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(true)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            ahji.e(str, cga.e, bmp.a(c).q, 0L, 0L, null, 0L, 2, false, 1, 0, null, bmp.d(c).n, c, i5 & 14, 3120, 55288);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(str, true, i, 12, null);
        }
    }

    public static void ak(aexz aexzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(1599544550);
        if ((i & 14) == 0) {
            if (true != c.G(aexzVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.H(true)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(-66668446);
            aexy aexyVar = (aexy) aexzVar;
            aeye aeyeVar = aexyVar.c;
            c.y(-971981080);
            if (aeyeVar != null) {
                ag(aeyeVar, c, 0);
                amx.a(amv.l(cga.e, 12.0f), c);
            }
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            ai(aexyVar.a, aexyVar.b, true, c, (i2 << 3) & 896, 0);
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aexzVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void al(defpackage.aexx r31, float r32, float r33, defpackage.awg r34, defpackage.bwj r35, int r36) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.al(aexx, float, float, awg, bwj, int):void");
    }

    public static aexs am(aexo aexoVar, int i, int i2) {
        int i3;
        int i4 = aexoVar.a;
        int i5 = aexoVar.b;
        int i6 = aexoVar.i;
        int i7 = (((i4 - i5) - i) - i2) - i6;
        if (i7 < (-i6) / 2) {
            return null;
        }
        List list = aexoVar.g;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((Number) listIterator.previous()).intValue() <= i7) {
                    i3 = listIterator.nextIndex();
                    break;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        return new aexs(i5, i, i2, i3 + 1, aexoVar.i + arrn.s(i7, 0));
    }

    public static int an(cuc cucVar, aexr aexrVar) {
        return cucVar.c(dqs.b(aexrVar.a));
    }

    public static int ao(cuc cucVar) {
        return cucVar.c(Integer.MAX_VALUE);
    }

    public static cvc ap(cuc cucVar, aexr aexrVar, int i) {
        return cucVar.e(dqs.k(aexrVar.a, 0, 0, 0, i, 7));
    }

    public static void aq(List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1805979586);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            aewy aewyVar = (aewy) it.next();
            int z = aqjn.z(list);
            cga p = amv.p(amh.i(cga.e, 16.0f, brg.a, 2));
            String str = aewyVar.a;
            aewz aewzVar = aewyVar.b;
            arqg arqgVar = aewyVar.c;
            aw(p, c, 3072);
            c.y(-166283069);
            if (i2 != z) {
                av(amh.i(cga.e, 16.0f, brg.a, 2), c, 6);
            }
            ((bwk) c).Y();
            i2 = i3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(list, i, 19);
        }
    }

    public static void ar(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1217662866);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.y(-130881874);
            if (str == null) {
                amx.a(amv.h(cga.e, brg.a), c);
                ((bwk) c).Y();
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aerz(i, 7);
                    return;
                }
                return;
            }
            ((bwk) c).Y();
            bwjVar2 = c;
            ahji.e(str, amh.j(amh.i(cga.e, 16.0f, brg.a, 2), brg.a, brg.a, brg.a, 4.0f, 7), 0L, 0L, 0L, null, 0L, 2, false, 0, 0, null, bmp.d(c).j, bwjVar2, (i2 & 14) | 48, 48, 63484);
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aery(str, i, 20);
        }
    }

    public static void as(aexv aexvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(713028859);
        if (i4 == 0) {
            if (true != c.G(aexvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            at(cdk.e(-1097106788, new aeqh(aexvVar, 19), c), c, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(aexvVar, i, 1);
        }
    }

    public static void at(arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1837500186);
        if (i4 == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            c.y(-1729281607);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = aexp.a;
                bwkVar.ad(T);
            }
            cue cueVar = (cue) T;
            bwkVar.Y();
            int i5 = i2 & 14;
            cga.a aVar = cga.e;
            int a = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((((((i5 | 384) << 6) & 896) | 6) >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexq(arqvVar, i, 0);
        }
    }

    public static void au(String str, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1911384266);
        if (i4 == 0) {
            if (true != c.G(str)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            c.y(-2044900022);
            if (str == null) {
                amx.a(amv.h(cga.e, brg.a), c);
                ((bwk) c).Y();
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aerz(i, 8);
                    return;
                }
                return;
            }
            ((bwk) c).Y();
            bwjVar2 = c;
            ahji.e(str, amh.j(amh.i(cga.e, 16.0f, brg.a, 2), brg.a, brg.a, brg.a, 4.0f, 7), 0L, 0L, 0L, null, 0L, 2, false, 0, 0, null, bmp.d(c).h, bwjVar2, (i2 & 14) | 48, 48, 63484);
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new aexq(str, i, 2);
        }
    }

    public static void av(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-349143119);
        if (i4 == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.V(cgaVar, brg.a, 0L, c, i2 & 14, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 18);
        }
    }

    public static void aw(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        bwj c = bwjVar.c(410548694);
        if ((i & 14) == 0) {
            if (true != c.G(null)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(null)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.I(null)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            int i7 = i2 >> 6;
            ahji.an(null, cgaVar, false, null, null, null, null, cdk.e(1826607507, new aeua(7), c), c, (i7 & 14) | 805306368 | (i7 & 112), 508);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ax(defpackage.aexh r16, defpackage.cga r17, long r18, boolean r20, defpackage.bwj r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.ax(aexh, cga, long, boolean, bwj, int, int):void");
    }

    public static void ay(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1349920005);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(2007691656);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = aexb.a;
                bwkVar.ad(T);
            }
            cue cueVar = (cue) T;
            bwkVar.Y();
            int i6 = (i2 >> 3) & 14;
            int i7 = (i2 << 3) & 112;
            int a = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((((((i7 | (i6 | 384)) << 6) & 896) | 6) >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(cgaVar, arqvVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void az(defpackage.aexg r28, defpackage.cga r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.az(aexg, cga, bwj, int, int):void");
    }

    public static void bA(long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(469795730);
        if (i4 == 0) {
            if (true != c.F(j)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            ahji.A(aetn.aQ(amv.h(cga.e, 26.0f), dga.a(R.string.progress_bar_overlay_infinite_spinner_content_description, c)), j, 2.0f, cku.g, 0, brg.a, c, ((i2 << 3) & 112) | 3456, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeut(j, i, 2);
        }
    }

    public static void bB(float f, long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-349775352);
        if (i5 == 0) {
            if (true != c.D(f)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.F(j)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga aQ = aetn.aQ(amv.h(cga.e, 26.0f), dga.b(R.string.progress_bar_overlay_finite_spinner_content_description, new Object[]{Integer.valueOf((int) (100.0f * f))}, c));
            long j2 = cku.g;
            c.y(-187745597);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new ahfm(f, 1);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            ahji.D((arqg) T, aQ, j, j2, 0, brg.a, c, ((i2 << 3) & 896) | 27648);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new agfq(f, j, i, 1);
        }
    }

    public static void bC(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(884893939);
        if (i4 == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            bqv.c(amv.h(cgaVar, 24.0f), awh.a, cku.h(cku.a, 0.3f), 0L, brg.a, brg.a, null, aevb.b, c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 13);
        }
    }

    public static void bD(aevl aevlVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1144319454);
        if (i5 == 0) {
            if (true != c.G(aevlVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (aevlVar instanceof aevi) {
            c.y(-1997678172);
            bH((aevi) aevlVar, cgaVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevlVar instanceof aevk) {
            c.y(-1997675324);
            bI((aevk) aevlVar, cgaVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevlVar instanceof aevg) {
            c.y(-1997672575);
            bE((aevg) aevlVar, cgaVar, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevlVar instanceof aevh) {
            c.y(-1997669837);
            bz(cgaVar, (aevh) aevlVar, c, (i2 >> 3) & 14);
            ((bwk) c).Y();
        } else if (aevlVar instanceof aevj) {
            c.y(-1997667596);
            bC(cgaVar, c, (i2 >> 3) & 14);
            ((bwk) c).Y();
        } else {
            c.y(-1997679620);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aevlVar, cgaVar, i, 15);
        }
    }

    public static void bE(aevg aevgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1436699874);
        if (i5 == 0) {
            if (true != c.G(aevgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = i2 & 126;
            if (aevgVar.c.a) {
                c.y(-1421559000);
                bG(aevgVar, cgaVar, c, i6);
                ((bwk) c).Y();
            } else {
                c.y(-1421477656);
                bF(aevgVar, cgaVar, c, i6);
                ((bwk) c).Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aevgVar, cgaVar, i, 16);
        }
    }

    public static void bF(aevg aevgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1745940039);
        if (i5 == 0) {
            if (true != c.G(aevgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cor bg = aeke.bg(aevgVar.b, c);
            cu(adf.a(amv.h(cgaVar, 48.0f), cku.h(cku.a, 0.52f), awh.a), amv.o(cga.e), brg.a, bg, dga.a(R.string.progress_bar_overlay_retry_button_content_description, c), cku.d, aevgVar.a, c, 4144, 4);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aevgVar, cgaVar, i, 17);
        }
    }

    public static void bG(aevg aevgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(184290810);
        if (i5 == 0) {
            if (true != c.G(aevgVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ahji.P(aevgVar.a, cgaVar, false, ahji.Q(bmp.a(c).y, bmp.a(c).z, c, 12), null, cdk.e(460632220, new aeqh(aevgVar, 9), c), c, (i2 & 112) | 1572864, 52);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aevgVar, cgaVar, i, 18);
        }
    }

    public static void bH(aevi aeviVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(527410632);
        if (i5 == 0) {
            if (true != c.G(aeviVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            bI(new aevk(null, aeviVar.a), cgaVar, c, i2 & 112);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aeviVar, cgaVar, i, 19);
        }
    }

    public static void bI(aevk aevkVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1606141880);
        if (i5 == 0) {
            if (true != c.G(aevkVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga d = amh.d(adf.a(cgaVar, cku.h(cku.a, 0.3f), awh.a), 3.0f);
            int i6 = cfq.a;
            cue a = akc.a(cfq.a.e, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, d);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cor bg = aeke.bg(aerb.ac, c);
            cu(amv.h(cga.e, 20.0f), null, brg.a, bg, dga.a(R.string.progress_bar_overlay_cancel_button_content_description, c), cku.d, aevkVar.b, c, 4102, 6);
            Float f = aevkVar.a;
            c.y(2091232531);
            if (f != null) {
                float floatValue = f.floatValue();
                if (floatValue == Float.POSITIVE_INFINITY) {
                    c.y(1619214223);
                    bA(cku.d, c, 0);
                    bwkVar.Y();
                } else {
                    c.y(1619303038);
                    bB(floatValue, cku.d, c, 0);
                    bwkVar.Y();
                }
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aesw(aevkVar, cgaVar, i, 20);
        }
    }

    public static void bJ(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(-1171919468);
        if ((i & 14) == 0) {
            if (true != c.G(null)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(null)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga c2 = amv.c(amv.t(amh.j(cga.e, 8.0f, brg.a, brg.a, brg.a, 14), brg.a, 720.0f, 1), 0.5f);
            ajw.b bVar = ajw.a;
            int i5 = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, c2);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            akc.b(aT(chk.a(amv.h(cga.e, 40.0f), awh.a), null, 4), c, 0);
            amx.a(amv.l(cga.e, 8.0f), c);
            akc.b(aT(chk.a(amv.d(amv.p(cga.e), 40.0f), awh.a(20.0f)), null, 4), c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aerz(i, 4);
        }
    }

    public static void bK(bwj bwjVar, int i) {
        int i2 = i | 54;
        int i3 = i2 & 91;
        bwj c = bwjVar.c(19114830);
        if (i3 == 18 && c.L()) {
            c.v();
        } else {
            cga i4 = amh.i(amv.p(cga.e), brg.a, 8.0f, 1);
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c, 0);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, i4);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            int i7 = i2 & 126;
            bJ(c, i7);
            amx.a(amv.d(cga.e, 16.0f), c);
            bL(c, i7);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aerz(i, 5);
        }
    }

    public static void bL(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        bwj c = bwjVar.c(2066578650);
        if ((i & 14) == 0) {
            if (true != c.G(null)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(null)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga p = amv.p(cga.e);
            int i5 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cga a3 = akf.a.a(amv.c(amv.t(amh.j(cga.e, brg.a, brg.a, 8.0f, brg.a, 11), brg.a, 720.0f, 1), 0.5f), cfq.a.f);
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, a3);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            akc.b(aT(chk.a(amv.d(amv.p(cga.e), 40.0f), awh.a(20.0f)), null, 4), c, 0);
            c.p();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aerz(i, 6);
        }
    }

    public static dhv bM(String str, boolean z, long j) {
        dhv.b bVar = new dhv.b((byte[]) null);
        if (z) {
            int a = bVar.a(new dip(j, 0L, null, null, null, null, null, 0L, null, null, 0L, dqj.b, null, 61438));
            try {
                bVar.f(str);
            } finally {
                bVar.h(a);
            }
        } else {
            bVar.f(str);
        }
        return bVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bN(defpackage.aeva r15, defpackage.aeux r16, defpackage.bwj r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.bN(aeva, aeux, bwj, int, int):void");
    }

    public static void bO(aeuq aeuqVar, aeux aeuxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-687559478);
        if (i6 == 0) {
            if (true != c.G(aeuqVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeuxVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cku ckuVar = (cku) aeuxVar.b.a(c, 0);
            cku ckuVar2 = (cku) aeuxVar.a.a(aeuqVar.b, c, 0);
            c.y(-2116581885);
            if (ckuVar2 != null) {
                j = ckuVar2.i;
            } else if (aeuqVar.a == aerb.di && ckuVar != null) {
                j = ckuVar.i;
            } else {
                j = bmp.a(c).s;
            }
            long j2 = j;
            ((bwk) c).Y();
            aerb aerbVar = aeuqVar.a;
            bU(aerbVar, j2, dea.a(cgaVar, aerbVar.name()), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aeuqVar, aeuxVar, cgaVar, i, 3);
        }
    }

    public static void bP(List list, cga cgaVar, cga cgaVar2, aeux aeuxVar, bwj bwjVar, int i, int i2) {
        int i3 = i2 & 2;
        bwj c = bwjVar.c(1353330332);
        if (i3 != 0) {
            cgaVar = cga.e;
        }
        if ((i2 & 4) != 0) {
            cgaVar2 = cga.e;
        }
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4++;
            aeur aeurVar = (aeur) it.next();
            bS(aeurVar, cgaVar, cgaVar2, aeuxVar, c, i & 8176);
            c.y(462994734);
            if (aeurVar != aqjn.ac(list)) {
                aeur aeurVar2 = (aeur) list.get(i4);
                if (!(aeurVar instanceof aeup) && !(aeurVar2 instanceof aeup)) {
                    amx.a(amv.l(cga.e, 4.0f), c);
                }
            }
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeme(list, cgaVar, cgaVar2, aeuxVar, i, i2, 2);
        }
    }

    public static void bQ(long j, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1267301627);
        if (i4 == 0) {
            if (true != c.F(j)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            bwjVar2 = c;
            ahji.e(dga.a(R.string.metatext_separator, c), null, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).l, bwjVar2, (i2 << 6) & 896, 0, 65530);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new aeut(j, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bR(defpackage.aeuy r27, long r28, defpackage.cga r30, defpackage.aeux r31, defpackage.bwj r32, int r33) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.bR(aeuy, long, cga, aeux, bwj, int):void");
    }

    public static void bS(aeur aeurVar, cga cgaVar, cga cgaVar2, aeux aeuxVar, bwj bwjVar, int i) {
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-268063120);
        if (i7 == 0) {
            if (true != c.G(aeurVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar2)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(aeuxVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else if (aeurVar instanceof aeuq) {
            c.y(-1133808015);
            bO((aeuq) aeurVar, aeuxVar, cgaVar, c, ((i2 << 3) & 896) | ((i2 >> 6) & 112));
            ((bwk) c).Y();
        } else if (!(aeurVar instanceof aeum)) {
            if (aeurVar instanceof aeuy) {
                c.y(-1133572322);
                aeuy aeuyVar = (aeuy) aeurVar;
                Integer num = aeuyVar.e;
                c.y(1210361020);
                if (num != null) {
                    j2 = ckw.d(num.intValue() | 4278190080L);
                } else {
                    cku ckuVar = (cku) aeuxVar.a.a(aeuyVar.d, c, 0);
                    if (ckuVar == null) {
                        j2 = bmp.a(c).s;
                    } else {
                        j2 = ckuVar.i;
                    }
                }
                bwk bwkVar = (bwk) c;
                bwkVar.Y();
                bR(aeuyVar, j2, cgaVar2, aeuxVar, c, i2 & 8064);
                bwkVar.Y();
            } else if (aeurVar instanceof aeuw) {
                c.y(-1133212350);
                bo(((aeuw) aeurVar).a, amv.h(amh.i(cga.e, 4.0f, brg.a, 2), 24.0f), c, 48);
                ((bwk) c).Y();
            } else if (aeurVar instanceof aeup) {
                c.y(-1133066557);
                cku ckuVar2 = (cku) aeuxVar.a.a(null, c, 0);
                c.y(1210376526);
                if (ckuVar2 == null) {
                    j = bmp.a(c).s;
                } else {
                    j = ckuVar2.i;
                }
                bwk bwkVar2 = (bwk) c;
                bwkVar2.Y();
                bQ(j, c, 0);
                bwkVar2.Y();
            } else {
                c.y(1210350907);
                ((bwk) c).Y();
                throw new armm();
            }
        } else {
            c.y(-1133709559);
            throw null;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lhq((Object) aeurVar, cgaVar, (Object) cgaVar2, (Object) aeuxVar, i, 14);
        }
    }

    public static dje bT(aeuy aeuyVar, bwj bwjVar) {
        dje djeVar;
        bwjVar.y(-148707491);
        if (aeuyVar.f) {
            bwjVar.y(843983596);
            djeVar = bmp.d(bwjVar).n;
        } else {
            bwjVar.y(843984938);
            djeVar = bmp.d(bwjVar).l;
        }
        bwjVar.q();
        bwjVar.q();
        return djeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bU(defpackage.aerb r20, long r21, defpackage.cga r23, defpackage.bwj r24, int r25) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.bU(aerb, long, cga, bwj, int):void");
    }

    public static awg bV(awg awgVar) {
        return (awg) awa.c(awgVar, null, null, new awd(brg.a), new awd(brg.a), 3);
    }

    public static awg bW(awg awgVar) {
        return (awg) awa.c(awgVar, new awd(brg.a), new awd(brg.a), null, null, 12);
    }

    public static float bX(aeul aeulVar) {
        aeuh aeuhVar = aeulVar.e;
        if (aeuhVar != aeuh.b && aeuhVar != aeuh.c) {
            return 8.0f;
        }
        return 1.0f;
    }

    public static float bY(aeul aeulVar) {
        if (true != aeulVar.v) {
            return 8.0f;
        }
        return 4.0f;
    }

    public static float bZ(aeul aeulVar) {
        arqr arqrVar;
        aeva aevaVar = aeulVar.i;
        if (aevaVar != null) {
            arqrVar = ((aeun) aevaVar).c;
        } else {
            arqrVar = null;
        }
        if (arqrVar != null) {
            return brg.a;
        }
        aeuh aeuhVar = aeulVar.e;
        if (aeuhVar != aeuh.c && aeuhVar != aeuh.d) {
            return 8.0f;
        }
        return 1.0f;
    }

    public static void ba(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, float f, cga cgaVar, aewd aewdVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        arqvVar.getClass();
        arqvVar2.getClass();
        arqvVar3.getClass();
        arqvVar4.getClass();
        int i10 = i & 14;
        bwj c = bwjVar.c(726106781);
        if (i10 == 0) {
            if (true != c.I(arqvVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar2)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar3)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqvVar4)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((57344 & i) == 0) {
            if (true != c.D(f)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((458752 & i) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (true != c.G(aewdVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        if ((2995931 & i2) == 599186 && c.L()) {
            c.v();
        } else {
            float cy = cy(f);
            c.y(-1518019052);
            cga a = chk.a(ajz.b(amv.v(cgaVar, null, 3)), cz(aewdVar));
            int i11 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i12 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar5 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar5);
            }
            caw.b(c, b, cwl.a.c);
            cga o = amv.o(cga.e);
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, o);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar6);
            }
            caw.b(c, b2, cwl.a.c);
            amu amuVar = amu.a;
            cga a6 = ams.a(amuVar, cga.e, cy);
            cue a7 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a8 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b3 = cfv.b(c, a6);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a7, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar7 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar7);
            }
            caw.b(c, b3, cwl.a.c);
            ako akoVar = ako.a;
            cga a9 = akm.a(akoVar, cga.e, cy);
            cue a10 = akc.a(cfq.a.a, false);
            int a11 = bwg.a(c);
            byx P4 = bwkVar.P();
            cga b4 = cfv.b(c, a9);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a10, cwl.a.e);
            caw.b(c, P4, cwl.a.d);
            arqv arqvVar8 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar8);
            }
            caw.b(c, b4, cwl.a.c);
            arqvVar.a(c, Integer.valueOf(i2 & 14));
            c.p();
            amx.a(akm.a(akoVar, cga.e, f), c);
            cga a12 = akm.a(akoVar, cga.e, cy);
            cue a13 = akc.a(cfq.a.a, false);
            int a14 = bwg.a(c);
            byx P5 = bwkVar.P();
            cga b5 = cfv.b(c, a12);
            arqg arqgVar5 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar5);
            } else {
                c.C();
            }
            caw.b(c, a13, cwl.a.e);
            caw.b(c, P5, cwl.a.d);
            arqv arqvVar9 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a14))) {
                Integer valueOf5 = Integer.valueOf(a14);
                bwkVar.ad(valueOf5);
                c.j(valueOf5, arqvVar9);
            }
            caw.b(c, b5, cwl.a.c);
            arqvVar2.a(c, Integer.valueOf((i2 >> 3) & 14));
            c.p();
            c.p();
            amx.a(ams.a(amuVar, cga.e, f), c);
            cga a15 = ams.a(amuVar, cga.e, cy);
            cue a16 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a17 = bwg.a(c);
            byx P6 = bwkVar.P();
            cga b6 = cfv.b(c, a15);
            arqg arqgVar6 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar6);
            } else {
                c.C();
            }
            caw.b(c, a16, cwl.a.e);
            caw.b(c, P6, cwl.a.d);
            arqv arqvVar10 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a17))) {
                Integer valueOf6 = Integer.valueOf(a17);
                bwkVar.ad(valueOf6);
                c.j(valueOf6, arqvVar10);
            }
            caw.b(c, b6, cwl.a.c);
            ako akoVar2 = ako.a;
            cga a18 = akm.a(akoVar2, cga.e, cy);
            cue a19 = akc.a(cfq.a.a, false);
            int a20 = bwg.a(c);
            byx P7 = bwkVar.P();
            cga b7 = cfv.b(c, a18);
            arqg arqgVar7 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar7);
            } else {
                c.C();
            }
            caw.b(c, a19, cwl.a.e);
            caw.b(c, P7, cwl.a.d);
            arqv arqvVar11 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a20))) {
                Integer valueOf7 = Integer.valueOf(a20);
                bwkVar.ad(valueOf7);
                c.j(valueOf7, arqvVar11);
            }
            caw.b(c, b7, cwl.a.c);
            arqvVar3.a(c, Integer.valueOf((i2 >> 6) & 14));
            c.p();
            amx.a(akm.a(akoVar2, cga.e, f), c);
            cga a21 = akm.a(akoVar2, cga.e, cy);
            cue a22 = akc.a(cfq.a.a, false);
            int a23 = bwg.a(c);
            byx P8 = bwkVar.P();
            cga b8 = cfv.b(c, a21);
            arqg arqgVar8 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar8);
            } else {
                c.C();
            }
            caw.b(c, a22, cwl.a.e);
            caw.b(c, P8, cwl.a.d);
            arqv arqvVar12 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a23))) {
                Integer valueOf8 = Integer.valueOf(a23);
                bwkVar.ad(valueOf8);
                c.j(valueOf8, arqvVar12);
            }
            caw.b(c, b8, cwl.a.c);
            arqvVar4.a(c, Integer.valueOf((i2 >> 9) & 14));
            c.p();
            c.p();
            c.p();
            c.p();
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new hmg(arqvVar, arqvVar2, arqvVar3, arqvVar4, f, cgaVar, aewdVar, i, 3);
        }
    }

    public static void bb(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, float f, cga cgaVar, aewd aewdVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        arqvVar.getClass();
        arqvVar2.getClass();
        arqvVar3.getClass();
        int i9 = i & 14;
        bwj c = bwjVar.c(165983605);
        if (i9 == 0) {
            if (true != c.I(arqvVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar2)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar3)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.D(f)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.G(aewdVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c.L()) {
            c.v();
        } else {
            float cy = cy(f);
            c.y(-1518019052);
            cga a = chk.a(ajz.b(amv.v(cgaVar, null, 3)), cz(aewdVar));
            int i10 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar4 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar4);
            }
            caw.b(c, b, cwl.a.c);
            cga o = amv.o(cga.e);
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, o);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar5 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar5);
            }
            caw.b(c, b2, cwl.a.c);
            amu amuVar = amu.a;
            cga a6 = ams.a(amuVar, cga.e, cy);
            cue a7 = akc.a(cfq.a.a, false);
            int a8 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b3 = cfv.b(c, a6);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a7, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar6);
            }
            caw.b(c, b3, cwl.a.c);
            arqvVar.a(c, Integer.valueOf(i2 & 14));
            c.p();
            amx.a(ams.a(amuVar, cga.e, f), c);
            cga a9 = ams.a(amuVar, cga.e, cy);
            cue a10 = akk.a(ajw.c, cfq.a.m, c, 0);
            int a11 = bwg.a(c);
            byx P4 = bwkVar.P();
            cga b4 = cfv.b(c, a9);
            arqg arqgVar4 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar4);
            } else {
                c.C();
            }
            caw.b(c, a10, cwl.a.e);
            caw.b(c, P4, cwl.a.d);
            arqv arqvVar7 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar7);
            }
            caw.b(c, b4, cwl.a.c);
            ako akoVar = ako.a;
            cga a12 = akm.a(akoVar, cga.e, cy);
            cue a13 = akc.a(cfq.a.a, false);
            int a14 = bwg.a(c);
            byx P5 = bwkVar.P();
            cga b5 = cfv.b(c, a12);
            arqg arqgVar5 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar5);
            } else {
                c.C();
            }
            caw.b(c, a13, cwl.a.e);
            caw.b(c, P5, cwl.a.d);
            arqv arqvVar8 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a14))) {
                Integer valueOf5 = Integer.valueOf(a14);
                bwkVar.ad(valueOf5);
                c.j(valueOf5, arqvVar8);
            }
            caw.b(c, b5, cwl.a.c);
            arqvVar2.a(c, Integer.valueOf((i2 >> 3) & 14));
            c.p();
            amx.a(akm.a(akoVar, cga.e, f), c);
            cga a15 = akm.a(akoVar, cga.e, cy);
            cue a16 = akc.a(cfq.a.a, false);
            int a17 = bwg.a(c);
            byx P6 = bwkVar.P();
            cga b6 = cfv.b(c, a15);
            arqg arqgVar6 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar6);
            } else {
                c.C();
            }
            caw.b(c, a16, cwl.a.e);
            caw.b(c, P6, cwl.a.d);
            arqv arqvVar9 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a17))) {
                Integer valueOf6 = Integer.valueOf(a17);
                bwkVar.ad(valueOf6);
                c.j(valueOf6, arqvVar9);
            }
            caw.b(c, b6, cwl.a.c);
            arqvVar3.a(c, Integer.valueOf((i2 >> 6) & 14));
            c.p();
            c.p();
            c.p();
            c.p();
            bwkVar.Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetx(arqvVar, arqvVar2, arqvVar3, f, cgaVar, aewdVar, i, 2);
        }
    }

    public static /* synthetic */ void bc(boolean z, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1801762240);
        if (i5 == 0) {
            if (true != c.H(z)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            akh.a(null, null, cdk.e(-1207309014, new aeps(z, arqwVar, 2), c), c, 3072, 7);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelm(z, arqwVar, i, 9);
        }
    }

    public static void bd(aevy aevyVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1547857146);
        if (i5 == 0) {
            if (true != c.G(aevyVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (aevyVar instanceof aevt) {
            c.y(913623567);
            bt((aevt) aevyVar, str, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevyVar instanceof aevu) {
            c.y(913626096);
            bn((aevu) aevyVar, str, null, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevyVar instanceof aevv) {
            c.y(913628527);
            bm((aevv) aevyVar, str, null, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevyVar instanceof aevw) {
            c.y(913631026);
            bg((aevw) aevyVar, str, c, i2 & 112);
            ((bwk) c).Y();
        } else if (aevyVar instanceof aevx) {
            c.y(913633684);
            bs((aevx) aevyVar, str, null, c, i2 & 112);
            ((bwk) c).Y();
        } else {
            c.y(913622342);
            ((bwk) c).Y();
            throw new armm();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(aevyVar, str, i, 0);
        }
    }

    public static void be(long j, cor corVar, long j2, cga cgaVar, float f, String str, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        float f2;
        int i3 = i2 & 8;
        bwj c = bwjVar.c(-1382292512);
        if (i3 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        if ((i2 & 16) != 0) {
            f2 = 0.6f;
        } else {
            f2 = f;
        }
        cga b = adf.b(amv.o(cgaVar2), j);
        int i4 = cfq.a;
        cue a = akc.a(cfq.a.a, false);
        int a2 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b2 = cfv.b(c, b);
        int i5 = cwl.a;
        arqg arqgVar = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar);
        } else {
            c.C();
        }
        caw.b(c, a, cwl.a.e);
        caw.b(c, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            bwkVar.ad(valueOf);
            c.j(valueOf, arqvVar);
        }
        caw.b(c, b2, cwl.a.c);
        ahji.N(corVar, str, akf.a.a(amv.b(cga.e, f2), cfq.a.e), j2, c, ((i >> 12) & 112) | 8 | ((i << 3) & 7168), 0);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgr(j, corVar, j2, cgaVar2, f2, str, i, i2, 1);
        }
    }

    public static void bf(ake akeVar, aevs aevsVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-5691831);
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aevsVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else if (aevsVar == aevs.b) {
            bi(akeVar, c, i2 & 14);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(akeVar, aevsVar, i, 4);
        }
    }

    public static void bg(aevw aevwVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1765858913);
        if (i5 == 0) {
            if (true != c.G(aevwVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            akh.a(aetn.aQ(adf.b(amv.o(cga.e), bmp.a(c).v), str), null, cdk.e(-852696331, new aelu(aevwVar, 17), c), c, 3072, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz(aevwVar, str, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bh(defpackage.aevy r16, java.lang.String r17, defpackage.cga r18, defpackage.aewd r19, defpackage.arqg r20, defpackage.bwj r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.bh(aevy, java.lang.String, cga, aewd, arqg, bwj, int, int):void");
    }

    public static void bi(ake akeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-391905410);
        if (i4 == 0) {
            if (true != c.G(akeVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga.a aVar = cga.e;
            int i5 = cfq.a;
            ahji.N(aeke.bg(aerb.dy, c), null, amv.h(akeVar.a(aVar, cfq.a.i), 32.0f), cku.h, c, 3128, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(akeVar, i, 15);
        }
    }

    public static void bj(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1002910246);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aY(cgaVar, null, cdk.e(-979996536, new aelu(str, 15), c), c, ((i2 >> 3) & 14) | 384, 2);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) str, cgaVar, i, 1);
        }
    }

    public static void bk(aewe aeweVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(990627936);
        if (i5 == 0) {
            if (true != c.G(aeweVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aewg aewgVar = (aewg) aeweVar;
            aZ(cdk.e(710069666, new aeqh(aeweVar, 10), c), cdk.e(959348067, new aeqh(aeweVar, 11), c), aewgVar.c, cA(aetn.aQ(cgaVar, aewgVar.a), aewgVar.d), aewgVar.b, c, 54);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aeweVar, cgaVar, i, 2);
        }
    }

    public static void bl(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(680419222);
        if (i4 == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            akc.b(ajz.b(amv.p(cgaVar)), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(cgaVar, i, 14);
        }
    }

    public static void bm(aevv aevvVar, String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-974161208);
        if (i5 == 0) {
            if (true != c.G(aevvVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2 | 384;
        if ((i6 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            cga o = amv.o(aVar);
            Uri uri = aevvVar.a;
            Uri uri2 = aevvVar.d;
            int i7 = csv.a;
            aeke.bf(uri, str, o, uri2, null, null, csv.a.a, null, brg.a, null, null, null, "GlideMonogram", aevvVar.c, null, null, c, (i6 & 112) | 12587016, 196608, 425840);
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aevvVar, str, cgaVar2, i, 6);
        }
    }

    public static void bn(aevu aevuVar, String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1710651399);
        if (i5 == 0) {
            if (true != c.G(aevuVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if (((i2 | 384) & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            akh.a(aetn.aQ(adf.b(amv.o(aVar), ckw.c(((Number) aevuVar.a.a(c, 0)).intValue())), str), null, cdk.e(1175487325, new aelu(aevuVar, 16), c), c, 3072, 6);
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aevuVar, str, cgaVar2, i, 7);
        }
    }

    public static void bo(aewe aeweVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(570368049);
        if (i5 == 0) {
            if (true != c.G(aeweVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aewg aewgVar = (aewg) aeweVar;
            int i6 = aewgVar.f;
            if (i6 == 2) {
                c.y(-110521538);
                bj(aewgVar.a, cgaVar, c, i2 & 112);
                ((bwk) c).Y();
            } else if (i6 == 3) {
                c.y(-110517857);
                bq(aewgVar.a, cgaVar, c, i2 & 112);
                ((bwk) c).Y();
            } else if (aewgVar.e.isEmpty()) {
                c.y(-110508669);
                bl(cgaVar, c, (i2 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aewgVar.e.size() == 1) {
                c.y(-110506692);
                bh((aevy) aqjn.X(aewgVar.e), aewgVar.a, cgaVar, aewgVar.b, aewgVar.d, c, (i2 << 3) & 896, 0);
                ((bwk) c).Y();
            } else {
                int i7 = i2 & 126;
                if (aewgVar.e.size() == 2) {
                    c.y(-110501270);
                    bk(aeweVar, cgaVar, c, i7);
                    ((bwk) c).Y();
                } else if (aewgVar.e.size() == 3) {
                    c.y(-110499382);
                    br(aeweVar, cgaVar, c, i7);
                    ((bwk) c).Y();
                } else {
                    c.y(-110498008);
                    bp(aeweVar, cgaVar, c, i7);
                    ((bwk) c).Y();
                }
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aeweVar, cgaVar, i, 3);
        }
    }

    public static void bp(aewe aeweVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(714597162);
        if (i5 == 0) {
            if (true != c.G(aeweVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aewg aewgVar = (aewg) aeweVar;
            cga cA = cA(aetn.aQ(cgaVar, aewgVar.a), aewgVar.d);
            ba(cdk.e(-1174718878, new aeqh(aeweVar, 12), c), cdk.e(1306455715, new aeqh(aeweVar, 13), c), cdk.e(-507336988, new aeqh(aeweVar, 14), c), cdk.e(1973837605, new aeqh(aeweVar, 15), c), aewgVar.c, cA, aewgVar.b, c, 3510);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aeweVar, cgaVar, i, 7);
        }
    }

    public static void bq(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(293101295);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aY(cgaVar, null, cdk.e(1003426305, new aelu(str, 18), c), c, ((i2 >> 3) & 14) | 384, 2);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) str, cgaVar, i, 8);
        }
    }

    public static void br(aewe aeweVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1386781427);
        if (i5 == 0) {
            if (true != c.G(aeweVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aewg aewgVar = (aewg) aeweVar;
            bb(cdk.e(130926850, new aeqh(aeweVar, 16), c), cdk.e(380205251, new aeqh(aeweVar, 17), c), cdk.e(629483652, new aeqh(aeweVar, 18), c), aewgVar.c, cA(aetn.aQ(cgaVar, aewgVar.a), aewgVar.d), aewgVar.b, c, 438);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aevz((Object) aeweVar, cgaVar, i, 9);
        }
    }

    public static void bs(aevx aevxVar, String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1057156266);
        if (i5 == 0) {
            if (true != c.G(aevxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2 | 384;
        if ((i6 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            arqv arqvVar = aevxVar.a;
            cga.a aVar = cga.e;
            be(ckw.c(((Number) arqvVar.a(c, 0)).intValue()), aeke.bg(aerb.w, c), bmp.a(c).v, aVar, 1.0f, str, c, ((i6 << 3) & 7168) | 24640 | ((i6 << 12) & 458752), 0);
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aevxVar, str, cgaVar2, i, 8);
        }
    }

    public static void bt(aevt aevtVar, String str, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-9502403);
        if (i5 == 0) {
            if (true != c.G(aevtVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if (((i2 | 384) & 731) == 146 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aevz(aevtVar, str, i, 6);
                return;
            }
            return;
        }
        amv.o(cga.e);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bu(defpackage.aevq r12, java.lang.String r13, boolean r14, defpackage.bwj r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.bu(aevq, java.lang.String, boolean, bwj, int, int):void");
    }

    public static void bv(aevp aevpVar, String str, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-358282337);
        if (i6 == 0) {
            if (true != c.G(aevpVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(str)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            afai afaiVar = new afai(str, new afag(aevpVar.a, null, null, null, 62));
            cga cgaVar = cga.e;
            if (!z) {
                cgaVar = aetn.aP(cga.e);
            }
            adom.bV(afaiVar, cgaVar, false, c, 384);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jyn(aevpVar, str, z, i, 15, null);
        }
    }

    public static void bw(aevm aevmVar, arqg arqgVar, boolean z, bwj bwjVar, int i) {
        int i2;
        float f;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-2074270111);
        boolean z3 = true;
        if (i6 == 0) {
            if (true != c.G(aevmVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new jyn(aevmVar, arqgVar, z, i, 14, null);
                return;
            }
            return;
        }
        if (true != z) {
            f = 1.0f;
        } else {
            f = brg.a;
        }
        aap aapVar = adom.bZ(c).f;
        c.y(-586753877);
        if ((i2 & 896) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 112) != 32) {
            z3 = false;
        }
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if ((z2 | z3) || T == bwj.a.a) {
            T = new whx(z, arqgVar, 2);
            bwkVar.ad(T);
        }
        bwkVar.Y();
        zl.c(f, aapVar, (arqr) T, c, 3136, 4);
        c.y(-586750127);
        throw null;
    }

    public static void bx(aeve aeveVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        AccessibilityManager accessibilityManager;
        boolean booleanValue;
        aeve aeveVar2;
        boolean z;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1332884603);
        if (i5 == 0) {
            if (true != c.G(aeveVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        if ((i6 & 731) == 146 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cgaVar2 = cga.e;
            if (aeveVar == null) {
                c.y(379046708);
                arqvVar.a(c, Integer.valueOf((i6 >> 6) & 14));
                ((bwk) c).Y();
            } else {
                c.y(379086388);
                c.y(1674911942);
                Object systemService = ((Context) c.g(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    accessibilityManager = (AccessibilityManager) systemService;
                } else {
                    accessibilityManager = null;
                }
                c.y(473433427);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    if (accessibilityManager != null) {
                        z = accessibilityManager.isEnabled();
                    } else {
                        z = false;
                    }
                    byu byuVar = new byu(Boolean.valueOf(z), cav.a);
                    bwkVar.ad(byuVar);
                    T = byuVar;
                }
                byn bynVar = (byn) T;
                bwkVar.Y();
                bxl.c(accessibilityManager, new aaop(accessibilityManager, bynVar, 7, null), c);
                booleanValue = ((Boolean) bynVar.a()).booleanValue();
                bwkVar.Y();
                if (booleanValue) {
                    aeveVar2 = new aeve(2, aeveVar.a, aeveVar.b);
                } else {
                    aeveVar2 = aeveVar;
                }
                by(aeveVar2, amh.c(cgaVar2, new amk(8.0f, 8.0f, 8.0f, 8.0f)), arqvVar, c, i6 & 896);
                bwkVar.Y();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aeveVar, cgaVar2, arqvVar, i, 4);
        }
    }

    public static void by(aeve aeveVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        cfq cfqVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(491705083);
        if (i6 == 0) {
            if (true != c.G(aeveVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            int i7 = aeveVar.c - 1;
            if (i7 != 0) {
                if (i7 != 1) {
                    int i8 = cfq.a;
                    cfqVar = cfq.a.e;
                } else {
                    int i9 = cfq.a;
                    cfqVar = cfq.a.i;
                }
            } else {
                int i10 = cfq.a;
                cfqVar = cfq.a.g;
            }
            cga.a aVar = cga.e;
            cue a = akc.a(cfqVar, false);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i2 >> 6) & 14));
            bD(aeveVar.a, cgaVar, c, i2 & 112);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeub(aeveVar, cgaVar, arqvVar, i, 5);
        }
    }

    public static void bz(cga cgaVar, aevh aevhVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1054949906);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aevhVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            long h = cku.h(cku.a, 0.3f);
            long j = cku.d;
            int i6 = cfq.a;
            cue a = akk.a(ajw.c, cfq.a.n, c, 48);
            int a2 = bwg.a(c);
            bwk bwkVar2 = (bwk) c;
            byx P = bwkVar2.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar2.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            ahji.P(aevhVar.b, null, false, ahji.Q(h, j, c, 12), null, aevb.a, c, 1572864, 54);
            String str = aevhVar.a;
            c.y(211963997);
            if (str != null) {
                awg awgVar = awh.a;
                cdi e = cdk.e(-988235861, new aevc(str, j, 0), c);
                bwkVar = bwkVar2;
                bqv.c(null, awgVar, h, 0L, brg.a, brg.a, null, e, c, 121);
            } else {
                bwkVar = bwkVar2;
            }
            bwkVar.Y();
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aesw(cgaVar, aevhVar, i, 14, null);
        }
    }

    private static cga cA(cga cgaVar, arqg arqgVar) {
        cga c;
        if (arqgVar != null && (c = adw.c(cgaVar, false, null, arqgVar, 7)) != null) {
            return c;
        }
        return cgaVar;
    }

    public static cfq.b ca(aeul aeulVar) {
        if (aeulVar.A == 1) {
            int i = cfq.a;
            return cfq.a.m;
        }
        int i2 = cfq.a;
        return cfq.a.o;
    }

    public static cfq cb(aeul aeulVar) {
        if (aeulVar.A == 1) {
            int i = cfq.a;
            return cfq.a.d;
        }
        int i2 = cfq.a;
        return cfq.a.f;
    }

    public static boolean cc(aeul aeulVar) {
        if (aeulVar.v && aeulVar.A == 1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ awg cd(aeul aeulVar) {
        if (aeulVar.y.c) {
            return awh.a(20.0f);
        }
        if (aeulVar.A == 2) {
            int ordinal = aeulVar.e.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return awh.b(20.0f, 4.0f, 20.0f, 20.0f);
                        }
                        throw new armm();
                    }
                    return awh.b(20.0f, 4.0f, 4.0f, 20.0f);
                }
                return awh.b(20.0f, 20.0f, 4.0f, 20.0f);
            }
            return awh.a(20.0f);
        }
        int ordinal2 = aeulVar.e.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        return awh.b(4.0f, 20.0f, 20.0f, 20.0f);
                    }
                    throw new armm();
                }
                return awh.b(4.0f, 20.0f, 20.0f, 4.0f);
            }
            return awh.b(20.0f, 20.0f, 20.0f, 4.0f);
        }
        return awh.a(20.0f);
    }

    public static float ce(float f, bwj bwjVar, int i) {
        float f2;
        bwjVar.y(-1368935303);
        int width = ((View) bwjVar.g(AndroidCompositionLocals_androidKt.f)).getWidth();
        if (width > 0) {
            bwjVar.y(939884123);
            f2 = ((dqv) bwjVar.g(dch.d)).eh(width);
            bwjVar.q();
        } else {
            bwjVar.y(939967792);
            f2 = ((Configuration) bwjVar.g(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            bwjVar.q();
        }
        if (1 == i) {
            f = 360.0f;
        }
        float min = Math.min(f, ((dqy) arrn.y(new dqy((f2 - 30.0f) - 16.0f), new dqy(brg.a))).a);
        bwjVar.q();
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void cf(defpackage.aeul r18, defpackage.cga r19, defpackage.zj r20, defpackage.aeux r21, defpackage.arqw r22, defpackage.bwj r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.cf(aeul, cga, zj, aeux, arqw, bwj, int, int):void");
    }

    public static void cg(amt amtVar, aeul aeulVar, arqg arqgVar, byn bynVar, float f, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        cfq cfqVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c = bwjVar.c(-255139151);
        if (i9 == 0) {
            if (true != c.G(amtVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqgVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(bynVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c.D(f)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((i2 & 374491) == 74898 && c.L()) {
            c.v();
        } else {
            cpm cpmVar = (cpm) c.g(dch.g);
            c.y(1339280021);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            float f2 = 1.0f;
            if (T == bwj.a.a) {
                T = new byr(1.0f);
                bwkVar.ad(T);
            }
            byj byjVar = (byj) T;
            bwkVar.Y();
            if (aeulVar.A == 2) {
                z = true;
            } else {
                z = false;
            }
            cga b = amtVar.b(cga.e, 1.0f, z);
            if (true == aeulVar.n) {
                f2 = 0.6f;
            }
            cga a = cha.a(b, f2);
            if (aeulVar.A == 2) {
                int i10 = cfq.a;
                cfqVar = cfq.a.c;
            } else {
                int i11 = cfq.a;
                cfqVar = cfq.a.a;
            }
            cue a2 = akc.a(cfqVar, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a);
            int i12 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            cp(((deo) c.g(dch.m)).d() * ((float) aeulVar.y.b), cdk.e(-1183831411, new aetw(aeulVar, arqgVar, cpmVar, byjVar, f, arqvVar), c), c, 48);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetx(amtVar, aeulVar, arqgVar, bynVar, f, arqvVar, i, 0);
        }
    }

    public static void ch(cga cgaVar, aeul aeulVar, aetu aetuVar, zj zjVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(-169008745);
        if (i8 == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aetuVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(zjVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = bxl.a(arpj.a, c);
                bwkVar.ad(T);
            }
            cga f = amh.f(amv.p(cgaVar), bY(aeulVar), bZ(aeulVar), 8.0f, bX(aeulVar));
            if (aeulVar.w != null) {
                f = f.a(cgh.a(cga.e, 1.0f));
            }
            cga cgaVar2 = f;
            c.y(1116803127);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new ajs();
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            cga b = adw.b(cgaVar2, (ajr) T2, null, false, null, null, new aeot(aetuVar, 7), 28);
            int i9 = (i2 >> 3) & 7168;
            cue a = akk.a(ajw.c, ca(aeulVar), c, 0);
            int a2 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
            int i10 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            arqwVar.a(ako.a, c, Integer.valueOf(((i9 >> 6) & 112) | 6));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aahs(cgaVar, aeulVar, aetuVar, zjVar, arqwVar, i, 4);
        }
    }

    public static void ci(akn aknVar, aeul aeulVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(834215989);
        if (i5 == 0) {
            if (true != c.G(aknVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aelg aelgVar = aeulVar.l;
            if (aelgVar == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aesw(aknVar, aeulVar, i, 10, null);
                    return;
                }
                return;
            }
            cga.a aVar = cga.e;
            int i6 = cfq.a;
            aetn.ar(aelgVar, amh.j(aknVar.a(aVar, cfq.a.o), brg.a, brg.a, brg.a, 2.0f, 7), c, 0);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aesw(aknVar, aeulVar, i, 9, null);
        }
    }

    public static void cj(cga cgaVar, aeul aeulVar, aeva aevaVar, aeux aeuxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(1548232062);
        if (i7 == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aevaVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(aeuxVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            if (aevaVar == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aelx(cgaVar, aeulVar, aeuxVar, i, 20, (byte[]) null);
                    return;
                }
                return;
            }
            cq(aeulVar, aevaVar, aeuxVar, amh.j(cgaVar, brg.a, 4.0f, brg.a, brg.a, 13), c, (i2 >> 3) & 1022);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new lhq(cgaVar, aeulVar, aevaVar, aeuxVar, i, 13, (short[]) null);
        }
    }

    public static void ck(ake akeVar, apeb apebVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-721244070);
        if (i6 == 0) {
            if (true != c.G(akeVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(apebVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            if (apebVar == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aesw(akeVar, arqgVar, i, 11, null);
                    return;
                }
                return;
            }
            agkx.v(akeVar, apebVar, true, arqgVar, c, (i2 & 14) | 384 | (i2 & 112) | ((i2 << 3) & 7168), 0);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeub(akeVar, apebVar, arqgVar, i, 1, (byte[]) null);
        }
    }

    public static void cl(ake akeVar, aeul aeulVar, bwj bwjVar, int i) {
        int i2;
        cfq cfqVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(513315059);
        boolean z = true;
        if (i5 == 0) {
            if (true != c.G(akeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            c.y(-1472336795);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(null, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            aevm aevmVar = aeulVar.h;
            if (aevmVar != null) {
                cm(bynVar, aevmVar);
            }
            aevm aevmVar2 = (aevm) bynVar.a();
            if (aevmVar2 == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aesw(akeVar, aeulVar, i, 13, null);
                    return;
                }
                return;
            }
            cga h = amv.h(cga.e, brg.a);
            if (aeulVar.A == 1) {
                int i6 = cfq.a;
                cfqVar = cfq.a.a;
            } else {
                int i7 = cfq.a;
                cfqVar = cfq.a.c;
            }
            cga a = akeVar.a(h, cfqVar);
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            if (aeulVar.h != null) {
                z = false;
            }
            c.y(1914495081);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new aetz(bynVar, 0);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bw(aevmVar2, (arqg) T2, z, c, 48);
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aesw(akeVar, aeulVar, i, 12, null);
        }
    }

    public static void cm(byn bynVar, aevm aevmVar) {
        bynVar.h(aevmVar);
    }

    public static void cn(ake akeVar, aeul aeulVar, byn bynVar, boolean z, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(319961404);
        if (i7 == 0) {
            if (true != c.G(akeVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeulVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(bynVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(z)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new jxg(akeVar, aeulVar, bynVar, z, i, 7);
                return;
            }
            return;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jxg(akeVar, aeulVar, bynVar, z, i, 6);
        }
    }

    public static void co(aeul aeulVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        bwj c = bwjVar.c(-1582085528);
        if ((i & 14) == 0) {
            if (true != c.G(aeulVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            aexx aexxVar = aeulVar.m;
            if (aexxVar != null) {
                if (true != aeulVar.g) {
                    f = 0.0f;
                } else {
                    f = 162.0f;
                }
                al(aexxVar, f, ce(brg.a, c, 1), bV(cd(aeulVar)), c, 0);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aery(aeulVar, i, 12);
        }
    }

    public static void cp(float f, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        arqvVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1255066995);
        if (i5 == 0) {
            if (true != c.D(f)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            bwx.a(dch.m.c(new aeuc(c, f)), arqvVar, c, (i2 & 112) | 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeud(f, arqvVar, i, 0);
        }
    }

    public static void cq(aeul aeulVar, aeva aevaVar, aeux aeuxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-26539395);
        if (i7 == 0) {
            if (true != c.G(aeulVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aevaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(aeuxVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            if (aevaVar.b().isEmpty()) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new lhq(aeulVar, aevaVar, aeuxVar, cgaVar, i, 11);
                    return;
                }
                return;
            }
            int i8 = i2 >> 3;
            int i9 = i8 & 14;
            boolean z = aeulVar.u;
            cga cgaVar2 = cga.e;
            if (!z) {
                cgaVar2 = aetn.aP(cgaVar2);
            }
            cga a = cgaVar2.a(cgaVar);
            int i10 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.l, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            if (aeuxVar != null) {
                c.y(1435135517);
                bN(aevaVar, aeuxVar, c, i8 & 126, 0);
                bwkVar.Y();
            } else {
                c.y(1435187504);
                bN(aevaVar, null, c, i9, 2);
                bwkVar.Y();
            }
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new lhq(aeulVar, aevaVar, aeuxVar, cgaVar, i, 12);
        }
    }

    public static /* synthetic */ void cr(aeul aeulVar, aeux aeuxVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        cga cgaVar2;
        float f;
        bwk bwkVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1575306430);
        if (i6 == 0) {
            if (true != c.G(aeulVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeuxVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            aeva aevaVar = aeulVar.i;
            if (aevaVar == null) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new aeub(aeulVar, aeuxVar, cgaVar, i, 2);
                    return;
                }
                return;
            }
            aeun aeunVar = (aeun) aevaVar;
            if (aeunVar.c != null) {
                z = true;
            } else {
                z = false;
            }
            arsb arsbVar = new arsb();
            c.y(-369595333);
            bwk bwkVar2 = (bwk) c;
            Object T = bwkVar2.T();
            if (T == bwj.a.a) {
                T = ascy.a(new dre(0L));
                bwkVar2.ad(T);
            }
            bwkVar2.Y();
            arsbVar.a = (ascd) T;
            Object T2 = bwkVar2.T();
            if (T2 == bwj.a.a) {
                T2 = bxl.a(arpj.a, c);
                bwkVar2.ad(T2);
            }
            arwe arweVar = (arwe) T2;
            c.y(-369591531);
            Object T3 = bwkVar2.T();
            if (T3 == bwj.a.a) {
                byu byuVar = new byu(null, cav.a);
                bwkVar2.ad(byuVar);
                T3 = byuVar;
            }
            byn bynVar = (byn) T3;
            bwkVar2.Y();
            c.y(-369586928);
            if (z) {
                cga b = cld.b(amv.d(cga.e, 40.0f), brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, null, false, 0, 126975);
                c.y(-1360890508);
                Object T4 = bwkVar2.T();
                if (T4 == bwj.a.a) {
                    T4 = aeua.a;
                    bwkVar2.ad(T4);
                }
                bwkVar2.Y();
                cgaVar2 = cgaVar.a(cts.a(b, (arqw) T4));
            } else {
                cgaVar2 = cgaVar;
            }
            bwkVar2.Y();
            int i7 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(c);
            byx P = bwkVar2.P();
            cga b2 = cfv.b(c, cgaVar2);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar2.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            c.y(-1360838819);
            c.y(-1360864339);
            if (true != z) {
                f = 12.0f;
            } else {
                f = brg.a;
            }
            cga j = amh.j(cga.e, brg.a, f, brg.a, brg.a, 13);
            if (z && aeunVar.b.b) {
                cga a3 = cur.a(amv.d(cga.e, 48.0f), new aeql(arsbVar, 12));
                c.y(-1705114061);
                Object T5 = bwkVar2.T();
                if (T5 == bwj.a.a) {
                    T5 = new ajs();
                    bwkVar2.ad(T5);
                }
                bwkVar2.Y();
                bwkVar = bwkVar2;
                j = j.a(adw.b(a3, (ajr) T5, null, false, null, null, new jda(aevaVar, arsbVar, arweVar, bynVar, 20), 28));
            } else {
                bwkVar = bwkVar2;
            }
            bwkVar.Y();
            if (z && !aeunVar.b.b) {
                cga d = amv.d(cga.e, 48.0f);
                c.y(-1705093165);
                Object T6 = bwkVar.T();
                if (T6 == bwj.a.a) {
                    T6 = new ajs();
                    bwkVar.ad(T6);
                }
                ajr ajrVar = (ajr) T6;
                bwkVar.Y();
                c.y(-1705090305);
                boolean G = c.G(aevaVar);
                Object T7 = bwkVar.T();
                if (G || T7 == bwj.a.a) {
                    T7 = new aetz(aevaVar, 2);
                    bwkVar.ad(T7);
                }
                bwkVar.Y();
                j = j.a(adw.b(d, ajrVar, null, false, null, null, (arqg) T7, 28));
            }
            bwkVar.Y();
            cq(aeulVar, aevaVar, aeuxVar, amh.j(j, brg.a, brg.a, brg.a, 4.0f, 7), c, (i2 & 14) | ((i2 << 3) & 896));
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeub(aeulVar, aeuxVar, cgaVar, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [aap, java.lang.Object] */
    public static void cs(aeul aeulVar, aetu aetuVar, zj zjVar, cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        float floatValue;
        int i3;
        cga cgaVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        bwj c = bwjVar.c(732705180);
        if ((i & 14) == 0) {
            if (true != c.G(aeulVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aetuVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(zjVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        int i8 = i2 | 3072;
        if ((57344 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i8 |= i4;
        }
        if ((46811 & i8) == 9362 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            c.y(1987550115);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new byr(brg.a);
                bwkVar.ad(T);
            }
            byj byjVar = (byj) T;
            bwkVar.Y();
            c.y(-2082451620);
            c.y(1367403391);
            Object T2 = bwkVar.T();
            Object obj = T2;
            if (T2 == bwj.a.a) {
                abd abdVar = new abd(byjVar.a());
                abdVar.d(Float.valueOf(brg.a));
                bwkVar.ad(abdVar);
                obj = abdVar;
            }
            bwkVar.Y();
            abt c2 = aby.c((abd) obj, null, c, 0, 2);
            aeua aeuaVar = aeua.c;
            acg acgVar = aci.a;
            ((Number) c2.e()).floatValue();
            c.y(2130560846);
            float floatValue2 = ((Number) byjVar.a()).floatValue();
            bwkVar.Y();
            Float valueOf = Float.valueOf(floatValue2);
            ((Number) c2.f()).floatValue();
            c.y(2130560846);
            float floatValue3 = ((Number) byjVar.a()).floatValue();
            bwkVar.Y();
            floatValue = ((Number) aby.e(c2, valueOf, Float.valueOf(floatValue3), aeuaVar.a(c2.d(), c, 0), acgVar, c, 196608).a()).floatValue();
            bwkVar.Y();
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                T3 = bxl.a(arpj.a, c);
                bwkVar.ad(T3);
            }
            cue a = akk.a(ajw.c, ca(aeulVar), c, 0);
            int a2 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Object valueOf2 = Integer.valueOf(a2);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cga.a aVar2 = cga.e;
            c.y(-221451345);
            boolean D = c.D(floatValue);
            Object T4 = bwkVar.T();
            if (!D && T4 != bwj.a.a) {
                i3 = 2;
            } else {
                i3 = 2;
                T4 = new kja(floatValue, 2);
                bwkVar.ad(T4);
            }
            bwkVar.Y();
            cga a3 = amd.a(aVar2, (arqr) T4);
            if (cc(aeulVar)) {
                a3 = a3.a(amh.i(cga.e, 19.0f, brg.a, i3));
            }
            ajw.d dVar = new ajw.d(-9.0f, true, ajx.a);
            int i10 = cfq.a;
            cue a4 = akk.a(dVar, cfq.a.m, c, 6);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, a3);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Object valueOf3 = Integer.valueOf(a5);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            ako akoVar = ako.a;
            cfq.c cVar = cfq.a.l;
            cga.a aVar3 = cga.e;
            cue a6 = amq.a(ajw.a, cVar, c, 48);
            int a7 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b3 = cfv.b(c, aVar3);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a6, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a7))) {
                Object valueOf4 = Integer.valueOf(a7);
                bwkVar.ad(valueOf4);
                c.j(valueOf4, arqvVar3);
            }
            caw.b(c, b3, cwl.a.c);
            amu amuVar = amu.a;
            c.y(-1426824511);
            c.y(-1426816093);
            int i11 = i8 & 112;
            Object T5 = bwkVar.T();
            if (i11 == 32 || T5 == bwj.a.a) {
                T5 = new aetz(aetuVar, 1);
                bwkVar.ad(T5);
            }
            bwkVar.Y();
            bwkVar.Y();
            int i12 = (i8 << 3) & 112;
            cg(amuVar, aeulVar, (arqg) T5, byjVar, floatValue, cdk.e(686936387, new aety(aeulVar, arqwVar), c), c, i12 | 199686);
            c.p();
            ci(akoVar, aeulVar, c, 6 | i12);
            c.p();
            c.p();
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aahs(aeulVar, aetuVar, zjVar, cgaVar2, arqwVar, i, 5);
        }
    }

    public static /* synthetic */ String ct(int i) {
        if (i != 1) {
            return VCardConstants.PROPERTY_END;
        }
        return "START";
    }

    public static void cu(cga cgaVar, cga cgaVar2, float f, cor corVar, String str, long j, arqg arqgVar, bwj bwjVar, int i, int i2) {
        cga cgaVar3;
        cga cgaVar4;
        float f2;
        long j2;
        int i3;
        aev a;
        corVar.getClass();
        int i4 = i2 & 1;
        bwj c = bwjVar.c(-1902342689);
        if (i4 != 0) {
            cgaVar3 = cga.e;
        } else {
            cgaVar3 = cgaVar;
        }
        if ((i2 & 2) != 0) {
            cgaVar4 = cga.e;
        } else {
            cgaVar4 = cgaVar2;
        }
        if ((i2 & 4) != 0) {
            f2 = 24.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 32) != 0) {
            i3 = i & (-458753);
            j2 = ((cku) c.g(blp.a)).i;
        } else {
            j2 = j;
            i3 = i;
        }
        c.y(477461951);
        cga.a aVar = cga.e;
        cga.a aVar2 = cga.e;
        c.y(763571874);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new ajs();
            bwkVar.ad(T);
        }
        ajr ajrVar = (ajr) T;
        bwkVar.Y();
        c.y(477466830);
        if (((Boolean) adom.bY(c).a.a()).booleanValue()) {
            a = bon.a(false, f2, 0L, 4);
        } else {
            a = biy.a(false, f2, c, ((i3 >> 3) & 112) | 6, 4);
        }
        bwkVar.Y();
        cga b = adw.b(aVar2, ajrVar, a, false, null, null, arqgVar, 28);
        bwkVar.Y();
        cga a2 = b.a(aetn.aQ(cgaVar3, str));
        int i5 = cfq.a;
        cue a3 = akc.a(cfq.a.a, false);
        int a4 = bwg.a(c);
        byx P = bwkVar.P();
        cga b2 = cfv.b(c, a2);
        int i6 = cwl.a;
        arqg arqgVar2 = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar2);
        } else {
            c.C();
        }
        caw.b(c, a3, cwl.a.e);
        caw.b(c, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
            Integer valueOf = Integer.valueOf(a4);
            bwkVar.ad(valueOf);
            c.j(valueOf, arqvVar);
        }
        caw.b(c, b2, cwl.a.c);
        ahji.N(corVar, null, akf.a.a(cgaVar4, cfq.a.e), j2, c, ((i3 >> 6) & 7168) | 56, 0);
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetp(cgaVar3, cgaVar4, f2, corVar, str, j2, arqgVar, i, i2);
        }
    }

    public static /* synthetic */ String cv(int i) {
        if (i != 1) {
            if (i != 2) {
                return "MaxWidth";
            }
            return "MaxSize";
        }
        return "Unscaled";
    }

    private static RcsDestinationId cw(String str) {
        if (str.startsWith("sip:")) {
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.j(str);
            atkvVar.k(2);
            return atkvVar.i();
        }
        throw new IllegalArgumentException("URI format not supported");
    }

    private static cga cx(cga cgaVar, String str, bwj bwjVar) {
        bwjVar.y(-250674106);
        cga a = cgaVar.a(aetn.aQ(cga.e, str));
        ((bwk) bwjVar).Y();
        return a;
    }

    private static float cy(float f) {
        return (1.0f - f) / 2.0f;
    }

    private static cmb cz(aewd aewdVar) {
        int ordinal = aewdVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return awh.a(24.0f);
                }
                throw new armm();
            }
            return clw.a;
        }
        return awh.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Conversation d(adcc adccVar) {
        if (!adccVar.b.isPresent()) {
            if (adccVar.a.isPresent()) {
                adqu adquVar = (adqu) adccVar.a.get();
                if (!adquVar.o) {
                    String uuid = UUID.randomUUID().toString();
                    atkm atkmVar = new atkm();
                    atkmVar.d(1);
                    atkmVar.c(uuid);
                    atkmVar.b(x(adquVar.c));
                    return atkmVar.a();
                }
                throw new IllegalArgumentException("Group message was not sent/received with a session!");
            }
            throw new IllegalArgumentException("No message or session presented");
        }
        return w((adrc) adccVar.b.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object e(apyh apyhVar) {
        try {
            Object a = apyhVar.a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("No result produced.");
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean f(InputStream inputStream, byte[] bArr) {
        inputStream.mark(bArr.length + 4);
        try {
            int read = inputStream.read();
            if (read == 13) {
                read = inputStream.read();
            }
            if (read == 10) {
                read = inputStream.read();
            }
            boolean z = false;
            if (read == 45 && inputStream.read() == 45) {
                int i = 0;
                while (true) {
                    if (i < bArr.length) {
                        int read2 = inputStream.read();
                        if (read2 == -1 || bArr[i] != read2) {
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            return z;
        } finally {
            inputStream.reset();
        }
    }

    public static void g(InputStream inputStream) {
        inputStream.mark(1);
        int read = inputStream.read();
        if (read == 13) {
            inputStream.mark(1);
            read = inputStream.read();
        }
        if (read != 10) {
            inputStream.reset();
        }
    }

    public static /* synthetic */ void gu(Optional optional) {
        String str;
        if (optional != null) {
            if (optional.isPresent()) {
                str = ((Message) optional.get()).h();
            } else {
                str = "empty message";
            }
            advr.k("Message received: %s", str);
        }
    }

    public static alog gv(adqu adquVar) {
        if (adquVar.a == adqt.CPIM_MESSAGE) {
            aifd b = aifd.b(adquVar.f);
            if (b.r()) {
                String h = b.h();
                if (h == null) {
                    int i = alog.d;
                    return alsx.a;
                }
                alob alobVar = new alob();
                adde addeVar = new adde(alobVar);
                byte[] bArr = b.c;
                if (bArr != null && bArr.length != 0) {
                    j(new ByteArrayInputStream(bArr), h, addeVar);
                    return alobVar.g();
                }
                int i2 = alog.d;
                return alsx.a;
            }
            ajpz j = ajki.j(adquVar.f);
            ContentType d = ContentType.d((String) j.c.b().orElseThrow(new zhh(20)));
            ajur ajurVar = new ajur(null);
            ajurVar.m(j.c.b);
            ajurVar.n(d);
            return alog.r(ajki.i(ajurVar.l()));
        }
        ContentType d2 = ContentType.d(adquVar.h);
        ajur ajurVar2 = new ajur(null);
        ajurVar2.m(aozb.w(adquVar.f));
        ajurVar2.n(d2);
        return alog.r(ajki.i(ajurVar2.l()));
    }

    public static String gw(adnk adnkVar) {
        return (String) adnkVar.j().map(new acpr(12)).map(new acpr(13)).orElse("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        r3.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(java.io.InputStream r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
        Lb:
            r2 = -1
            if (r1 == r2) goto L21
            r2 = 13
            if (r1 == r2) goto L1e
            r2 = 10
            if (r1 == r2) goto L21
            r0.write(r1)     // Catch: java.lang.Throwable -> L30
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
            goto Lb
        L1e:
            r3.read()     // Catch: java.lang.Throwable -> L30
        L21:
            r0.close()
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "utf-8"
            r0.<init>(r3, r1)
            return r0
        L30:
            r3 = move-exception
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcx.h(java.io.InputStream):java.lang.String");
    }

    public static String i(String str) {
        String substring;
        int indexOf = str.indexOf("boundary=");
        if (indexOf < 0) {
            return null;
        }
        int i = indexOf + 9;
        int indexOf2 = str.indexOf(59, i);
        if (indexOf2 < i) {
            substring = str.substring(i);
        } else {
            substring = str.substring(i, indexOf2);
        }
        if (substring.startsWith("\"")) {
            substring = substring.substring(1, substring.length());
        }
        if (substring.endsWith("\"")) {
            return substring.substring(0, substring.length() - 1);
        }
        return substring;
    }

    public static void j(InputStream inputStream, String str, adaf adafVar) {
        int read;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, str.length() + 4);
        }
        byte[] bytes = str.getBytes();
        while (true) {
            if (f(inputStream, bytes) || inputStream.read() == -1) {
                g(inputStream);
                long length = bytes.length + 2;
                if (inputStream.skip(length) < length) {
                    return;
                }
                g(inputStream);
                char c = 2;
                inputStream.mark(2);
                try {
                    if (inputStream.read() == 45 && inputStream.read() == 45) {
                        return;
                    }
                    inputStream.reset();
                    adafVar.a();
                    for (String h = h(inputStream); !agkx.ae(h); h = h(inputStream)) {
                        if (!agkx.ae(h)) {
                            int indexOf = h.indexOf(58);
                            if (indexOf != -1) {
                                if (indexOf != h.length()) {
                                    adxq adxqVar = new adxq();
                                    adxqVar.a = h.substring(0, indexOf);
                                    adxqVar.b = h.substring(indexOf + 1, h.length()).trim();
                                    adafVar.d(adxqVar);
                                } else {
                                    throw new adag("Illegal header: ".concat(h));
                                }
                            } else {
                                throw new adag("Illegal header: ".concat(h));
                            }
                        } else {
                            throw new IllegalArgumentException("Line must not be null");
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    while (!f(inputStream, bytes)) {
                        try {
                            if (c != 3) {
                                if (f(inputStream, bytes)) {
                                    c = 3;
                                } else {
                                    read = inputStream.read();
                                    byteArrayOutputStream.write(read);
                                }
                            }
                            read = -1;
                            byteArrayOutputStream.write(read);
                        } catch (Throwable th) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    int length2 = byteArray.length;
                    adafVar.b(byteArray);
                    adafVar.c();
                } finally {
                    inputStream.reset();
                }
            }
        }
    }

    public static boolean k() {
        return anfi.a("cslib.enable_fi_multi_sync_help_article_in_rcs_settings", "cslib");
    }

    public static void l(String str, long j, Bundle bundle) {
        bundle.putString(RcsIntents.EXTRA_PHONE_NUMBER, str);
        bundle.putLong(RcsIntents.EXTRA_CONTACT_ID, j);
        bundle.putBoolean(RcsIntents.EXTRA_IS_BLOCKED_USER, false);
    }

    public static /* synthetic */ Optional m(adhf adhfVar, IOException iOException) {
        advr.i(iOException, "Connection Failed.", new Object[0]);
        adhfVar.b.s(19, iOException);
        return Optional.empty();
    }

    public static SipMessage n(ainh ainhVar) {
        String str;
        if (ainhVar.s()) {
            aini ainiVar = (aini) ainhVar;
            str = ainiVar.i() + " " + ainiVar.w() + " SIP/2.0\r\n";
        } else {
            ainj ainjVar = (ainj) ainhVar;
            str = "SIP/2.0 " + ainjVar.w() + " " + ainjVar.x() + VCardBuilder.VCARD_END_OF_LINE;
        }
        StringBuilder sb = new StringBuilder();
        for (aimh aimhVar : ainhVar.d) {
            if (!(aimhVar instanceof aima)) {
                sb.append(aimhVar);
            }
        }
        byte[] bArr = ainhVar.k;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append("Content-Length: ");
        sb.append(bArr.length);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return new SipMessage(str, sb.toString(), bArr);
    }

    public static ailh o(adfn adfnVar, adju adjuVar) {
        String str;
        if (adfnVar.d.hasTransport(0)) {
            str = adjuVar.a;
        } else {
            str = adjuVar.d;
        }
        if ("SIPoUDP".equals(str)) {
            return ailh.UDP;
        }
        if ("SIPoTLS".equals(str)) {
            return ailh.TLS;
        }
        return ailh.TCP;
    }

    public static apiu p(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 4) {
                    return apiu.NETWORK_INTERFACE_TYPE_UNKNOWN;
                }
                return apiu.NETWORK_INTERFACE_TYPE_VPN;
            }
            return apiu.NETWORK_INTERFACE_TYPE_WIFI;
        }
        return apiu.NETWORK_INTERFACE_TYPE_MOBILE_DATA;
    }

    public static String q(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 4) {
                    return "Unknown";
                }
                return "VPN";
            }
            return "WiFi";
        }
        return "Mobile";
    }

    public static Optional r(adew adewVar) {
        adfa adfaVar = ((adet) adewVar).b;
        if (adfaVar == null) {
            return Optional.empty();
        }
        return adfaVar.c();
    }

    public static wcz s(String str) {
        String str2 = null;
        try {
            aiks n = new ailc(str, (int[]) null).n();
            if (n.l()) {
                aikp aikpVar = (aikp) n;
                String e = aikpVar.e();
                if (e == null || Objects.equals(aikpVar.m(), "phone") || PhoneNumberUtils.isGlobalPhoneNumber(e)) {
                    str2 = e;
                }
            } else if (n instanceof aikq) {
                aikq aikqVar = (aikq) n;
                if (aikqVar.e()) {
                    str2 = "+" + aikqVar.a();
                } else {
                    str2 = aikqVar.a();
                }
            }
        } catch (ailb unused) {
        }
        if (str2 != null) {
            aozy createBuilder = wcz.a.createBuilder();
            aozy createBuilder2 = wcx.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wcx wcxVar = (wcx) createBuilder2.b;
            wcxVar.b |= 1;
            wcxVar.c = str2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcz wczVar = (wcz) createBuilder.b;
            wcx wcxVar2 = (wcx) createBuilder2.s();
            wcxVar2.getClass();
            wczVar.c = wcxVar2;
            wczVar.b = 1;
            return (wcz) createBuilder.s();
        }
        return t(str);
    }

    public static wcz t(String str) {
        if (str.startsWith("sip:")) {
            aozy createBuilder = wcz.a.createBuilder();
            aozy createBuilder2 = wed.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wed wedVar = (wed) createBuilder2.b;
            str.getClass();
            wedVar.b |= 1;
            wedVar.c = str;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcz wczVar = (wcz) createBuilder.b;
            wed wedVar2 = (wed) createBuilder2.s();
            wedVar2.getClass();
            wczVar.c = wedVar2;
            wczVar.b = 2;
            return (wcz) createBuilder.s();
        }
        throw new IllegalArgumentException("URI format not supported");
    }

    public static MessagingResult u(int i) {
        if (i == 200) {
            return MessagingResult.d;
        }
        if (i != 403) {
            if (i != 404) {
                if (i != 488) {
                    if (i >= 400 && i <= 499) {
                        return MessagingResult.h;
                    }
                    if (i >= 500 && i <= 599) {
                        return MessagingResult.g;
                    }
                    return MessagingResult.f;
                }
                return MessagingResult.k;
            }
            return MessagingResult.i;
        }
        return MessagingResult.j;
    }

    public static MessagingResult v(addt addtVar) {
        if (addtVar.c.isPresent()) {
            return MessagingResult.h;
        }
        if (aczx.s() && addtVar.d.isPresent()) {
            return new addj().apply((adqv) addtVar.d.get());
        }
        return u(addtVar.b);
    }

    public static Conversation w(adrc adrcVar) {
        String str;
        RcsDestinationId x;
        String str2;
        if (adrcVar.ak()) {
            str = adrcVar.A;
        } else {
            str = adrcVar.z;
        }
        int i = 1;
        if (str == null) {
            if (true != adrcVar.ak()) {
                str2 = "contributionId is null in SIMPLE-IM session";
            } else {
                str2 = "conversationId is null in CPM session";
            }
            throw new IllegalArgumentException(str2);
        }
        atkm atkmVar = new atkm();
        atkmVar.c(str);
        if (true == adrcVar.F) {
            i = 2;
        }
        atkmVar.d(i);
        if (adrcVar.F) {
            x = cw(adrcVar.J);
        } else {
            x = x(adrcVar.y());
        }
        atkmVar.b(x);
        return atkmVar.a();
    }

    public static RcsDestinationId x(String str) {
        String str2;
        aiks n;
        try {
            n = new ailc(str, (int[]) null).n();
        } catch (ailb unused) {
        }
        if (n.l()) {
            aikp aikpVar = (aikp) n;
            str2 = aikpVar.e();
            if (str2 != null) {
                if (!"phone".equals(aikpVar.m())) {
                    if (PhoneNumberUtils.isGlobalPhoneNumber(str2)) {
                    }
                    str2 = null;
                }
            } else {
                throw new IllegalArgumentException("User is null");
            }
        } else {
            if (n instanceof aikq) {
                aikq aikqVar = (aikq) n;
                if (aikqVar.e()) {
                    str2 = "+" + aikqVar.a();
                } else {
                    str2 = aikqVar.a();
                }
            }
            str2 = null;
        }
        if (str2 != null) {
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.j(str2);
            atkvVar.k(1);
            return atkvVar.i();
        }
        return cw(str);
    }

    public static String y(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId.b() - 1 != 0) {
            return rcsDestinationId.a();
        }
        return "tel:".concat(rcsDestinationId.a());
    }

    public static boolean z(Context context) {
        Uri uri = aefm.a;
        int i = context.getApplicationInfo().uid;
        if (i == -1 || context.checkUriPermission(aefm.a, 0, i, 1) != 0) {
            return false;
        }
        return true;
    }

    public adcx(char[] cArr, byte[] bArr) {
    }

    public adcx() {
        int intValue = ((Integer) aczf.o().a.ax.a()).intValue();
        int intValue2 = ((Integer) aczf.o().a.ay.a()).intValue();
        int intValue3 = ((Integer) aczf.o().a.az.a()).intValue();
        d.t(intValue > 0, "Capacity must be positive");
        d.t(intValue2 > 0, "Refill rate must be positive");
        d.t(intValue3 > 0, "Refill amount must be positive");
        Duration.ofMillis(intValue2).toNanos();
        new ArrayDeque();
    }

    public adcx(byte[] bArr) {
        advr.k("InsufficientContentRestorer for TMO GS22 is installed.", new Object[0]);
    }
}
