package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvd extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd(amlx amlxVar, amlw amlwVar, Integer num, amkr amkrVar, wyp wypVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = amlxVar;
        this.b = amlwVar;
        this.c = num;
        this.d = amkrVar;
        this.a = wypVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                return ((lvd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((lvd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((lvd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                aozy createBuilder = amly.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj4 = this.e;
                apag apagVar = createBuilder.b;
                amly amlyVar = (amly) apagVar;
                amlyVar.d = ((amlx) obj4).t;
                amlyVar.b |= 4;
                Object obj5 = this.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                amly amlyVar2 = (amly) createBuilder.b;
                amlyVar2.c = ((amlw) obj5).U;
                amlyVar2.b |= 1;
                Object obj6 = this.c;
                if (obj6 != null) {
                    int intValue = ((Integer) obj6).intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amly amlyVar3 = (amly) createBuilder.b;
                    amlyVar3.b |= 8;
                    amlyVar3.e = intValue;
                }
                Object obj7 = this.d;
                if (obj7 != null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amly amlyVar4 = (amly) createBuilder.b;
                    amlyVar4.i = (amkr) obj7;
                    amlyVar4.b |= 128;
                }
                Object obj8 = this.a;
                apag s = createBuilder.s();
                s.getClass();
                ((wyp) obj8).l((amly) s);
                return arnb.a;
            }
            aqil.P(obj);
            Object obj9 = this.e;
            Activity activity = ((iqd) this.d).a;
            Uri uri = (Uri) this.a;
            String m = ydk.m(activity, uri);
            ((arsa) obj9).a = ydk.a(activity, uri);
            String b = gh.b(ydk.p(((iqd) this.d).a, (Uri) this.a));
            obj2 = ((iqd) this.d).b.get();
            ((arsa) this.b).a = ((Number) ((ioa) obj2).c.a()).longValue();
            obj3 = ((iqd) this.d).b.get();
            ((arsa) this.c).a = ((Number) ((ioa) obj3).b.a()).longValue();
            if (((Boolean) utw.o.e()).booleanValue()) {
                ameb amebVar = ameb.FILE_CHOOSER;
                if (amebVar != null) {
                    Object obj10 = this.a;
                    if (obj10 != null) {
                        if (m != null) {
                            long j = ((arsa) this.e).a;
                            if (b != null) {
                                return new imy(b, (Uri) obj10, amebVar, m, j);
                            }
                            throw new NullPointerException("Null contentType");
                        }
                        throw new NullPointerException("Null fileName");
                    }
                    throw new NullPointerException("Null uri");
                }
                throw new NullPointerException("Null contentSource");
            }
            return new FileContentItem((Uri) this.a, b, m, ((arsa) this.e).a);
        }
        aqil.P(obj);
        alvw g = lve.a.g();
        g.X(alwp.a, "BugleBackup");
        alvg alvgVar = (alvg) g;
        alvgVar.V(10, TimeUnit.SECONDS);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 57, "RestoreEventLogger.kt")).q("Logging restore start event to clearcut");
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.RESTORE_WORKFLOW_EVENT, amfqVar);
        aozy createBuilder2 = amxs.a.createBuilder();
        createBuilder2.getClass();
        aktp.aO((amxr) this.b, createBuilder2);
        aktp.aQ(yyb.bX((UUID) this.c), createBuilder2);
        aktp.aP((lwz) this.d, createBuilder2);
        Object obj11 = this.e;
        if (obj11 != null) {
            int intValue2 = ((Number) obj11).intValue();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amxs amxsVar = (amxs) createBuilder2.b;
            amxsVar.b |= 16;
            amxsVar.i = intValue2;
        }
        aozy createBuilder3 = amxv.a.createBuilder();
        createBuilder3.getClass();
        apag s2 = createBuilder3.s();
        s2.getClass();
        amxv amxvVar = (amxv) s2;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxs amxsVar2 = (amxs) createBuilder2.b;
        amxsVar2.d = amxvVar;
        amxsVar2.c = 4;
        alzz.p(aktp.aN(createBuilder2), amfqVar);
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        mar a = ((mbb) ((lve) this.a).b.b()).a();
        a.e(amrs.RESTORE_WORKFLOW_EVENT);
        a.b((amfq) builder, mbt.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        alvw g2 = lve.a.g();
        g2.X(alwp.a, "BugleBackup");
        alvg alvgVar2 = (alvg) g2;
        alvgVar2.V(10, TimeUnit.SECONDS);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 74, "RestoreEventLogger.kt")).t("Logging restore start event to clearcut: %s", this.b);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.e;
                Object obj3 = this.b;
                Object obj4 = this.c;
                return new lvd((amlx) obj2, (amlw) obj3, (Integer) obj4, (amkr) this.d, (wyp) this.a, arpeVar, 2);
            }
            Object obj5 = this.d;
            Object obj6 = this.a;
            Object obj7 = this.e;
            return new lvd((iqd) obj5, (Uri) obj6, (arsa) obj7, (arsa) this.b, (arsa) this.c, arpeVar, 1);
        }
        Object obj8 = this.a;
        Object obj9 = this.b;
        Object obj10 = this.c;
        return new lvd((lve) obj8, (amxr) obj9, (UUID) obj10, (lwz) this.d, (Integer) this.e, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd(iqd iqdVar, Uri uri, arsa arsaVar, arsa arsaVar2, arsa arsaVar3, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = iqdVar;
        this.a = uri;
        this.e = arsaVar;
        this.b = arsaVar2;
        this.c = arsaVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd(lve lveVar, amxr amxrVar, UUID uuid, lwz lwzVar, Integer num, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.a = lveVar;
        this.b = amxrVar;
        this.c = uuid;
        this.d = lwzVar;
        this.e = num;
    }
}
