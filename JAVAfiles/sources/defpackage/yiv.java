package defpackage;

import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yiv extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(admf admfVar, Object obj, Object obj2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = admfVar;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 4:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((yiv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [afdz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r11v50, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v73, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [admc, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Integer num;
        adtl adtlVar;
        Spanned spanned;
        ekb[] ekbVarArr = null;
        switch (this.d) {
            case 0:
                aqil.P(obj);
                MessageIdType r = ((SuggestionData) ((alog) this.a).get(0)).r();
                Object obj2 = ((yyt) this.b).b;
                aozy createBuilder = yix.a.createBuilder();
                if (aqbc.SCREEN_EFFECTS == null) {
                    num = new Integer(1);
                } else {
                    num = (Integer) yig.c.e();
                }
                num.getClass();
                int intValue = num.intValue();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((yix) createBuilder.b).d = intValue;
                String a = r.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                yix yixVar = (yix) createBuilder.b;
                a.getClass();
                yixVar.c = a;
                String a2 = ((ConversationIdType) this.c).a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                a2.getClass();
                ((yix) apagVar).b = a2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((yix) createBuilder.b).e = true;
                return ((uof) ((wfh) obj2).a.b()).a(upk.b("request_smart_suggestions", (yix) createBuilder.s(), new uta(null, r.a(), null, null, null, null)));
            case 1:
                aqil.P(obj);
                return ((xgj) this.b).b((qei) this.c, (aqut) this.a);
            case 2:
                aqil.P(obj);
                ((cit) this.b).b();
                ?? r11 = this.a;
                if (r11 != 0) {
                    r11.f((View) this.c, false);
                }
                return arnb.a;
            case 3:
                aqil.P(obj);
                ((ahmv) this.a).d((ConversationIdType) this.c, 232, (MessageIdType) this.b);
                return null;
            case 4:
                aqil.P(obj);
                if (((admf) this.c).q.get()) {
                    ((alvg) admf.d.i().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$2", "invokeSuspend", 375, "StateMachineV2.kt")).t("Can't send message %s on a StateMachineV2 instance that has already quit.", this.b);
                    return arnb.a;
                }
                arsb arsbVar = new arsb();
                arsbVar.a = ((admf) this.c).i();
                for (admg admgVar : ((admf) this.c).v) {
                    admgVar.a();
                }
                if (((admf) this.c).t.get()) {
                    while (true) {
                        adtl adtlVar2 = (adtl) arsbVar.a;
                        if (adtlVar2 != null) {
                            if (!adtlVar2.c.x(this.b, this.a)) {
                                ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$2", "invokeSuspend", 390, "StateMachineV2.kt")).D("Sent message %s to %s", this.b, arsbVar.a);
                                admf admfVar = (admf) this.c;
                                Object obj3 = admfVar.g.get(((adtl) arsbVar.a).b);
                                if (obj3 == null) {
                                    adtlVar = null;
                                } else {
                                    adtlVar = (adtl) admfVar.j.get(obj3);
                                }
                                arsbVar.a = adtlVar;
                                if (arsbVar.a == null && !((admf) this.c).q.get()) {
                                    if (!((Boolean) admf.b.a()).booleanValue()) {
                                        ((alvg) admf.d.i().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$2", "invokeSuspend", 406, "StateMachineV2.kt")).D("No state could handle the message %s, current states: %s", this.b, ((admf) this.c).d());
                                    } else {
                                        throw new IllegalStateException("No state could handle the message: " + this.b + ", current states: " + ((admf) this.c).d());
                                    }
                                }
                            }
                        }
                    }
                    return arnb.a;
                }
                ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$2", "invokeSuspend", 385, "StateMachineV2.kt")).D("Pretend sent message %s to %s", this.b, ((admf) this.c).a());
                return arnb.a;
            case 5:
                aqil.P(obj);
                if (((aenr) this.b).a.b.length() <= 0) {
                    Object obj4 = this.a;
                    aenw aenwVar = aenw.a;
                    aeny aenyVar = ((aeoa) obj4).a;
                    if (aenyVar != aenwVar && aenyVar != aenw.b && aenyVar != aenw.d && aenyVar != aenw.e && !d.F(aenyVar, aenx.a)) {
                        if (aenyVar != aenw.c && aenyVar != aenw.f && aenyVar != null) {
                            throw new armm();
                        }
                        return arnb.a;
                    }
                }
                this.c.h(Boolean.valueOf(true));
                return arnb.a;
            case 6:
                aqil.P(obj);
                Object obj5 = this.b;
                Object obj6 = this.c;
                String bn = aeke.bn((Uri) obj6);
                return afdv.b(this.a, "ofSingle for ".concat(bn), true, new aaop(obj5, obj6, 20));
            case 7:
                aqil.P(obj);
                return aipx.b(((afiz) this.b).b, (Uri) this.c, (aipw) this.a);
            case 8:
                aqil.P(obj);
                Object obj7 = this.a;
                afpx afpxVar = (afpx) this.b;
                CharSequence a3 = afpxVar.a(obj7);
                CharSequence d = ((ejx) this.c).d(a3, 0, a3.length(), a3.length(), 1);
                d.getClass();
                afpxVar.f = d;
                afpx afpxVar2 = (afpx) this.b;
                CharSequence charSequence = afpxVar2.f;
                if (charSequence instanceof Spanned) {
                    spanned = (Spanned) charSequence;
                } else {
                    spanned = null;
                }
                if (spanned != null) {
                    ekbVarArr = (ekb[]) spanned.getSpans(0, spanned.length(), ekb.class);
                }
                afpxVar2.g = ekbVarArr;
                ((afpx) this.b).postInvalidate();
                return arnb.a;
            default:
                aqil.P(obj);
                arrn.J(this.b, null, null, new albt((asai) this.a, (cez) this.c, (arpe) null, 1), 3);
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r4v7, types: [afdz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [byn, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                return new yiv((alog) obj2, (yyt) this.b, (ConversationIdType) this.c, arpeVar, 0);
            case 1:
                Object obj3 = this.b;
                return new yiv((xgj) obj3, (qei) this.c, (aqut) this.a, arpeVar, 1);
            case 2:
                return new yiv((cit) this.b, (agak) this.a, (View) this.c, arpeVar, 2);
            case 3:
                Object obj4 = this.a;
                return new yiv((ahmv) obj4, (ConversationIdType) this.c, (MessageIdType) this.b, arpeVar, 3);
            case 4:
                return new yiv((admf) this.c, this.b, this.a, arpeVar, 4);
            case 5:
                Object obj5 = this.b;
                return new yiv((aenr) obj5, (aeoa) this.a, (byn) this.c, arpeVar, 5);
            case 6:
                return new yiv((afdv) this.b, (afdz) this.a, (Uri) this.c, arpeVar, 6);
            case 7:
                Object obj6 = this.b;
                return new yiv((afiz) obj6, (Uri) this.c, (aipw) this.a, arpeVar, 7);
            case 8:
                Object obj7 = this.b;
                return new yiv((afpx) obj7, (ejx) this.c, this.a, arpeVar, 8);
            default:
                return new yiv((arwe) this.b, (asai) this.a, (cez) this.c, arpeVar, 9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(aenr aenrVar, aeoa aeoaVar, byn bynVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = aenrVar;
        this.a = aeoaVar;
        this.c = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(afdv afdvVar, afdz afdzVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = afdvVar;
        this.a = afdzVar;
        this.c = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(afiz afizVar, Uri uri, aipw aipwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = afizVar;
        this.c = uri;
        this.a = aipwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(afpx afpxVar, ejx ejxVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = afpxVar;
        this.c = ejxVar;
        this.a = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(ahmv ahmvVar, ConversationIdType conversationIdType, MessageIdType messageIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = ahmvVar;
        this.c = conversationIdType;
        this.b = messageIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(alog alogVar, yyt yytVar, ConversationIdType conversationIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = alogVar;
        this.b = yytVar;
        this.c = conversationIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(arwe arweVar, asai asaiVar, cez cezVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = arweVar;
        this.a = asaiVar;
        this.c = cezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(cit citVar, agak agakVar, View view, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = citVar;
        this.a = agakVar;
        this.c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiv(xgj xgjVar, qei qeiVar, aqut aqutVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = xgjVar;
        this.c = qeiVar;
        this.a = aqutVar;
    }
}
