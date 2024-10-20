package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.DuoKitContainerActivity;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.SetupDuoResponse;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvf {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling");
    private final anen b;
    private final afxz c;

    public yvf(anen anenVar, afxz afxzVar) {
        this.b = anenVar;
        this.c = afxzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(alog alogVar, int i) {
        HashSet hashSet = new HashSet();
        int size = alogVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(((ParticipantsTable.BindData) alogVar.get(i2)).M());
        }
        if (hashSet.isEmpty()) {
            return;
        }
        tbb f = ParticipantsTable.f();
        f.aj("updateAvailabilityInDb");
        f.K(i);
        f.M(new yur(hashSet, 5));
        f.a().e();
    }

    private static DuoId[] g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String o = ((msh) it.next()).o(((Boolean) new mss(7).get()).booleanValue());
            if (!albo.ah(o)) {
                DuoId duoId = new DuoId();
                duoId.b = o;
                abhx.d(duoId);
                arrayList.add(duoId);
            } else {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling", "duoIdsFromMessagingIdentities", 126, "DuoKitVideoCalling.java")).q("Fail to get destination from messagingIdentities.");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (DuoId[]) arrayList.toArray(new DuoId[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v5, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [alhr, java.lang.Object] */
    public final akul a(msh mshVar) {
        String o = mshVar.o(((Boolean) new mss(7).get()).booleanValue());
        if (o == null) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling", "launchCall", 85, "DuoKitVideoCalling.java")).q("Fail to get destination from messageIdentity.");
            return aktp.ag(false);
        }
        DuoId duoId = new DuoId();
        duoId.b = o;
        abhx.d(duoId);
        StartCallRequest startCallRequest = new StartCallRequest();
        startCallRequest.a = duoId;
        startCallRequest.c = true;
        startCallRequest.d = yvq.a.d;
        afxz afxzVar = this.c;
        ((acak) afxzVar.c.get()).i(5, algw.h(startCallRequest.d));
        acak acakVar = (acak) afxzVar.c.get();
        acir a2 = ((abxa) afxzVar.d).a();
        acit acitVar = new acit();
        a2.s(new abxk(acitVar, (Context) afxzVar.a, acakVar, startCallRequest, 0));
        a2.r(new vdn(acakVar, acitVar, 6, null));
        return akul.g(agkx.f((acir) acitVar.a)).h(new yts(8), andi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [alhr, java.lang.Object] */
    public final akul b(List list) {
        DuoId[] g = g(list);
        if (g == null) {
            return aktp.ag(false);
        }
        final StartGroupCreationFlowRequest startGroupCreationFlowRequest = new StartGroupCreationFlowRequest();
        startGroupCreationFlowRequest.a = g;
        startGroupCreationFlowRequest.c = true;
        startGroupCreationFlowRequest.b = yvq.a.d;
        afxz afxzVar = this.c;
        ((acak) afxzVar.c.get()).i(12, algw.h(startGroupCreationFlowRequest.b));
        final acak acakVar = (acak) afxzVar.c.get();
        acir a2 = ((abxa) afxzVar.d).a();
        final acit acitVar = new acit();
        final Context context = (Context) afxzVar.a;
        a2.s(new acim() { // from class: abxl
            @Override // defpackage.acim
            public final void e(Object obj) {
                alpt g2;
                algw i;
                int i2;
                abwv abwvVar = (abwv) obj;
                StartGroupCreationFlowRequest startGroupCreationFlowRequest2 = startGroupCreationFlowRequest;
                acit acitVar2 = acit.this;
                try {
                    StartGroupCreationFlowResponse startGroupCreationFlowResponse = new StartGroupCreationFlowResponse();
                    boolean z = false;
                    if (startGroupCreationFlowRequest2.a == null) {
                        g2 = altg.a;
                    } else {
                        alpr alprVar = new alpr();
                        for (DuoId duoId : startGroupCreationFlowRequest2.a) {
                            int i3 = duoId.a;
                            if (i3 == 1) {
                                alprVar.c(duoId.b);
                            } else {
                                Log.w("DuoKitStrtGrpCrtnFlw", a.bV(i3, "Ignoring id type: "));
                            }
                        }
                        g2 = alprVar.g();
                    }
                    if (TextUtils.isEmpty(startGroupCreationFlowRequest2.b)) {
                        i = alfd.a;
                    } else {
                        i = algw.i(startGroupCreationFlowRequest2.b);
                    }
                    boolean b = abwvVar.b();
                    acak acakVar2 = acakVar;
                    Context context2 = context;
                    if (b) {
                        if (new Intent("com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS").setPackage("com.google.android.apps.tachyon").resolveActivity(context2.getPackageManager()) != null) {
                            Intent addFlags = new Intent("com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW").setClassName(context2, DuoKitContainerActivity.class.getName()).putStringArrayListExtra("members", new ArrayList<>(g2)).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (i.f()) {
                                addFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) i.b());
                            }
                            context2.startActivity(addFlags);
                            z = true;
                        } else {
                            Log.w("DuoKitContainerActivity", "Duo can't handle group flow intent, fallback to Duo home screen");
                            Intent addFlags2 = new Intent("com.google.android.gms.duokit.action.LAUNCH_DUO").setClassName(context2, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (i.f()) {
                                addFlags2.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) i.b());
                            }
                            context2.startActivity(addFlags2);
                        }
                        aozy createBuilder = apue.a.createBuilder();
                        int size = g2.size();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        ((apue) apagVar).b = size;
                        if (true != z) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        ((apue) createBuilder.b).c = a.an(i2);
                        apue apueVar = (apue) createBuilder.s();
                        aozy createBuilder2 = apuj.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ((apuj) createBuilder2.b).d = a.av(12);
                        Object obj2 = acakVar2.a;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar2 = createBuilder2.b;
                        obj2.getClass();
                        ((apuj) apagVar2).e = (String) obj2;
                        if (!apagVar2.isMutable()) {
                            createBuilder2.u();
                        }
                        ((apuj) createBuilder2.b).f = a.ao(4);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apuj apujVar = (apuj) createBuilder2.b;
                        apueVar.getClass();
                        apujVar.c = apueVar;
                        apujVar.b = 12;
                        acakVar2.d((apuj) createBuilder2.s());
                    } else if (!abhx.c(context2) && startGroupCreationFlowRequest2.c) {
                        aozy createBuilder3 = apue.a.createBuilder();
                        int size2 = g2.size();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        ((apue) createBuilder3.b).b = size2;
                        apue apueVar2 = (apue) createBuilder3.s();
                        aozy createBuilder4 = apuj.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        ((apuj) createBuilder4.b).d = a.av(12);
                        Object obj3 = acakVar2.a;
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar3 = createBuilder4.b;
                        obj3.getClass();
                        ((apuj) apagVar3).e = (String) obj3;
                        if (!apagVar3.isMutable()) {
                            createBuilder4.u();
                        }
                        ((apuj) createBuilder4.b).f = a.ao(7);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apuj apujVar2 = (apuj) createBuilder4.b;
                        apueVar2.getClass();
                        apujVar2.c = apueVar2;
                        apujVar2.b = 12;
                        acakVar2.d((apuj) createBuilder4.s());
                        abhx.i(context2, acakVar2, i);
                    } else {
                        Log.w("DuoKitStrtGrpCrtnFlw", "Duo installed but can't handle the API");
                        acakVar2.h(12);
                        throw new abwt("Failed to handle the API call");
                    }
                    acitVar2.b(startGroupCreationFlowResponse);
                } catch (abwt e) {
                    acitVar2.a(e);
                }
            }
        });
        a2.r(new vdn(acakVar, acitVar, 7, null));
        return akul.g(agkx.f((acir) acitVar.a)).h(new yts(10), andi.a);
    }

    public final akul c() {
        int i = alog.d;
        return d(alsx.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
    public final akul d(List list) {
        final SetupDuoRequest setupDuoRequest = new SetupDuoRequest();
        DuoId[] g = g(list);
        if (g != null) {
            setupDuoRequest.a = g;
        }
        afxz afxzVar = this.c;
        ((acak) afxzVar.c.get()).i(7, alfd.a);
        final acak acakVar = (acak) afxzVar.c.get();
        acir a2 = ((abxa) afxzVar.d).a();
        final acit acitVar = new acit();
        final SetupDuoResponse setupDuoResponse = new SetupDuoResponse();
        final Context context = (Context) afxzVar.a;
        a2.s(new acim() { // from class: abxh
            @Override // defpackage.acim
            public final void e(Object obj) {
                abwv abwvVar = (abwv) obj;
                boolean b = abwvVar.b();
                Context context2 = context;
                acak acakVar2 = acakVar;
                if (b) {
                    DuoKitContainerActivity.a(context2, false, new ArrayList());
                    acakVar2.k(6);
                } else if (abwvVar.a() == 2) {
                    SetupDuoRequest setupDuoRequest2 = setupDuoRequest;
                    ArrayList arrayList = new ArrayList();
                    if (setupDuoRequest2.a != null) {
                        alpr alprVar = new alpr();
                        for (DuoId duoId : setupDuoRequest2.a) {
                            if (duoId.a == 1) {
                                alprVar.c(duoId.b);
                            }
                        }
                        arrayList.addAll(alprVar.g());
                    }
                    DuoKitContainerActivity.a(context2, true, arrayList);
                    acakVar2.k(3);
                } else {
                    abhx.i(context2, acakVar2, alfd.a);
                }
                acitVar.b(setupDuoResponse);
            }
        });
        a2.r(new abxi(context, acakVar, acitVar, setupDuoResponse, 0));
        return akul.g(agkx.f((acir) acitVar.a)).h(new yts(9), andi.a);
    }

    public final akul e(alog alogVar) {
        if (alogVar.isEmpty()) {
            return aktp.ag(alogVar);
        }
        return akul.g(agkx.f(this.c.k())).i(new ytu(alogVar, 10), this.b);
    }
}
