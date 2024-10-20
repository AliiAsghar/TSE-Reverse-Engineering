package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyo extends arpw implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyo(qxr qxrVar, boolean z, psk pskVar, ConversationIdType conversationIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.d = qxrVar;
        this.a = z;
        this.b = pskVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((jyo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((jyo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((jyo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((jyo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [agnq, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        amlx amlxVar;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    aozy createBuilder = amly.a.createBuilder();
                    createBuilder.getClass();
                    if (this.a) {
                        amlxVar = amlx.PROVISIONING_UI_TYPE_RCS_DEFAULT_ON_OOB;
                    } else {
                        amlxVar = amlx.PROVISIONING_UI_TYPE_RCS_SUCCESS;
                    }
                    Object obj2 = this.c;
                    Object obj3 = this.b;
                    Object obj4 = this.d;
                    akec.ay(amlxVar, createBuilder);
                    akec.ax((amlw) obj4, createBuilder);
                    akec.aw(((acnu) ((wyp) obj3).e.b()).a(new adiw((String) obj2)), createBuilder);
                    ((wyp) this.b).l(akec.av(createBuilder));
                    return arnb.a;
                }
                aqil.P(obj);
                Object obj5 = this.c;
                Object obj6 = this.b;
                boolean z = this.a;
                qxr qxrVar = (qxr) this.d;
                qxrVar.g.e("RbmToolstoneDatabaseOperations#persistToolstoneState", new rhh(z, (psk) obj6, qxrVar, (ConversationIdType) obj5, 1));
                return arnb.a;
            }
            aqil.P(obj);
            if (this.a) {
                if (((eng) this.b).a(eng.STARTED) && ((gqg) this.d).b() > 0) {
                    Object obj7 = this.c;
                    ((jym) obj7).k.a(((gqg) this.d).h(0));
                }
            }
            return arnb.a;
        }
        aqil.P(obj);
        if (this.a) {
            if (((eng) this.b).a(eng.STARTED)) {
                Object obj8 = this.d;
                ((jym) obj8).l.a(this.c);
            }
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jzj] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj2 = this.b;
                    boolean z = this.a;
                    Object obj3 = this.d;
                    return new jyo((wyp) obj2, z, (amlw) obj3, (String) this.c, arpeVar, 3);
                }
                Object obj4 = this.d;
                boolean z2 = this.a;
                Object obj5 = this.b;
                return new jyo((qxr) obj4, z2, (psk) obj5, (ConversationIdType) this.c, arpeVar, 2);
            }
            boolean z3 = this.a;
            Object obj6 = this.b;
            return new jyo(z3, (eng) obj6, (gqg) this.d, (jym) this.c, arpeVar, 1);
        }
        boolean z4 = this.a;
        Object obj7 = this.b;
        return new jyo(z4, (eng) obj7, (jzj) this.c, (jym) this.d, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyo(wyp wypVar, boolean z, amlw amlwVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = wypVar;
        this.a = z;
        this.d = amlwVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyo(boolean z, eng engVar, gqg gqgVar, jym jymVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = z;
        this.b = engVar;
        this.d = gqgVar;
        this.c = jymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyo(boolean z, eng engVar, jzj jzjVar, jym jymVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = z;
        this.b = engVar;
        this.c = jzjVar;
        this.d = jymVar;
    }
}
