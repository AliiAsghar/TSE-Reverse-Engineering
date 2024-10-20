package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tty implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ tty(mwf mwfVar, mjq mjqVar, aozy aozyVar, mit mitVar, mwb mwbVar, mll mllVar, alog alogVar, int i) {
        this.h = i;
        this.g = mwfVar;
        this.a = mjqVar;
        this.c = aozyVar;
        this.e = mitVar;
        this.d = mwbVar;
        this.f = mllVar;
        this.b = alogVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, mll] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, altk] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        alpt altxVar;
        int i = this.h;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                return ((vuz) this.d).e((sng) this.f, ((vvb) this.g).g, new vuy((ConversationIdType) this.a, (String) this.b, (String) this.c), (qwm) this.e, (String) ((Optional) obj).map(new vrx(20)).orElse(null));
            }
            nfb nfbVar = (nfb) obj;
            boolean z = nfbVar.a;
            boolean z2 = nfbVar.d;
            boolean z3 = nfbVar.c;
            Object obj2 = this.a;
            if (obj2 == null) {
                aozy aozyVar = (aozy) this.c;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amjk amjkVar = (amjk) aozyVar.b;
                amjk amjkVar2 = amjk.a;
                amjkVar.b |= 8192;
                amjkVar.o = z3;
                ammc ammcVar = ((amjk) aozyVar.b).l;
                if (ammcVar == null) {
                    ammcVar = ammc.a;
                }
                aozy builder = ammcVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                ammc ammcVar2 = (ammc) apagVar;
                ammcVar2.b |= 2;
                ammcVar2.d = z2;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                apag apagVar2 = builder.b;
                ammc ammcVar3 = (ammc) apagVar2;
                ammcVar3.b |= 32;
                ammcVar3.h = z;
                boolean z4 = nfbVar.f;
                if (!apagVar2.isMutable()) {
                    builder.u();
                }
                ammc ammcVar4 = (ammc) builder.b;
                ammcVar4.b |= 64;
                ammcVar4.i = z4;
                ammc ammcVar5 = (ammc) builder.s();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amjk amjkVar3 = (amjk) aozyVar.b;
                ammcVar5.getClass();
                amjkVar3.l = ammcVar5;
                amjkVar3.b |= 1024;
            }
            Object obj3 = this.e;
            Object obj4 = this.g;
            if (obj3 != mit.RBM && !z2) {
                alwl alwlVar = (alwl) mwf.a.g();
                alwlVar.X(ydl.q, ((mwf) obj4).h);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 719, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SIMPLE due to Recipient NOT Rcs-enabled.");
                return new kor(mjq.SIMPLE);
            }
            mwb mwbVar = (mwb) this.d;
            mwbVar.i(z3);
            if (z) {
                i2 = 1;
            }
            ?? r3 = this.f;
            mwbVar.d = i2;
            if (!z && r3.b() != mit.RBM) {
                mwbVar.d = 3;
            }
            alwl alwlVar2 = (alwl) mwf.a.g();
            alwlVar2.X(ydl.q, ((mwf) obj4).h);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 705, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: RICH due to Recipient Rcs-enabled.");
            if (obj2 == null) {
                obj2 = mjq.RICH;
            }
            if (obj3 != mit.RBM && !mwf.h(r3, (alog) this.b)) {
                altxVar = alpt.r(mjq.SIMPLE, mjq.RICH);
            } else {
                altxVar = new altx(mjq.RICH);
            }
            return new kor((mjq) obj2, altxVar);
        }
        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
        aozy createBuilder = apwo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        Object obj5 = this.b;
        apag apagVar3 = createBuilder.b;
        apwo apwoVar = (apwo) apagVar3;
        obj5.getClass();
        apwoVar.b = 2 | apwoVar.b;
        String str = (String) obj5;
        apwoVar.d = str;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        Object obj6 = this.c;
        apwo apwoVar2 = (apwo) createBuilder.b;
        apwoVar2.b = 1 | apwoVar2.b;
        apwoVar2.c = "application/vnd.google.rcs.success";
        aozb w = aozb.w((byte[]) obj6);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apwo apwoVar3 = (apwo) apagVar4;
        apwoVar3.b |= 4;
        apwoVar3.e = w;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        Object obj7 = this.g;
        ?? r7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.a;
        apwo apwoVar4 = (apwo) createBuilder.b;
        obj9.getClass();
        apwoVar4.f = (apwq) obj9;
        apwoVar4.b |= 8;
        ttz ttzVar = (ttz) obj10;
        apwl c = ttzVar.j.c((apwo) createBuilder.s(), (rve) obj8, str, r7, true, false, amhz.READ_REPORT, nativeMessageEncryptorV2);
        rve a = ttzVar.h.a();
        asmg asmgVar = new asmg((byte[]) null, (byte[]) null);
        asmgVar.t(ajqu.DISPLAY);
        asmgVar.q(a.f());
        asmgVar.r(ajqu.DISPLAY.f);
        asmgVar.s((Instant) obj7);
        asmgVar.p(c.toByteString());
        try {
            return new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ajsa.d(asmgVar.m()).a.H(), a.f());
        } catch (ajsh e) {
            throw new wyz(e);
        }
    }

    public /* synthetic */ tty(ttz ttzVar, String str, byte[] bArr, apwq apwqVar, rve rveVar, altk altkVar, Instant instant, int i) {
        this.h = i;
        this.a = ttzVar;
        this.b = str;
        this.c = bArr;
        this.d = apwqVar;
        this.e = rveVar;
        this.f = altkVar;
        this.g = instant;
    }

    public /* synthetic */ tty(vuz vuzVar, sng sngVar, vvb vvbVar, ConversationIdType conversationIdType, String str, String str2, qwm qwmVar, int i) {
        this.h = i;
        this.d = vuzVar;
        this.f = sngVar;
        this.g = vvbVar;
        this.a = conversationIdType;
        this.b = str;
        this.c = str2;
        this.e = qwmVar;
    }
}
