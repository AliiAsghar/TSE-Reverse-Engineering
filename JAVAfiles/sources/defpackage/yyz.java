package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyz {
    public final armf a;
    public final armf b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public yyz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.m = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.k = armfVar5;
        armfVar6.getClass();
        this.j = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
        armfVar8.getClass();
        this.g = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
        armfVar10.getClass();
        this.b = armfVar10;
        armfVar11.getClass();
        this.l = armfVar11;
        armfVar12.getClass();
        this.e = armfVar12;
        armfVar13.getClass();
        this.i = armfVar13;
    }

    private static void o(Bundle bundle, TreeMap treeMap, xar xarVar) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "null";
            }
            treeMap.put(str, new xas(obj, xarVar));
        }
    }

    private static void p(Bundle bundle, Optional optional, String str) {
        optional.ifPresent(new vxb(bundle, str, 14, null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final SelfIdentityId a() {
        Object parcelable;
        if (yhx.f) {
            Bundle bundle = ((yyw) this.f.b()).m;
            if (bundle != null) {
                parcelable = bundle.getParcelable("self_identity_id", SelfIdentityId.class);
                return (SelfIdentityId) parcelable;
            }
            return null;
        }
        Bundle bundle2 = ((yyw) this.f.b()).m;
        if (bundle2 != null) {
            return (SelfIdentityId) bundle2.getParcelable("self_identity_id");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final StartChatViewModel b() {
        return (StartChatViewModel) this.d.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean c() {
        Bundle bundle = ((yyw) this.f.b()).m;
        if (bundle != null) {
            return yzc.v(bundle.getInt("selection_mode")).b();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final boolean d() {
        return lga.q(((yyw) this.f.b()).F(), ((aqws) this.h.b()).a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final akul e(xxk xxkVar) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new xgk(this, xxkVar, (arpe) null, 14));
        return c;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arpi, java.lang.Object] */
    public final Object f(xxk xxkVar, arpe arpeVar) {
        return arro.q(this.e, new uog(this, xxkVar, (arpe) null, 20), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yzf
            if (r0 == 0) goto L13
            r0 = r5
            yzf r0 = (defpackage.yzf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yzf r0 = new yzf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L65
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.d
            java.lang.Object r5 = r5.b()
            okf r5 = (defpackage.okf) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.j
            java.lang.Object r5 = r5.b()
            zeo r5 = (defpackage.zeo) r5
            ascv r5 = r5.e
            java.lang.Object r5 = r5.c()
            nfw r5 = (defpackage.nfw) r5
            goto L70
        L51:
            java.lang.Object r5 = r4.h
            java.lang.Object r5 = r5.b()
            nfx r5 = (defpackage.nfx) r5
            akul r5 = r5.d()
            r0.b = r3
            java.lang.Object r5 = defpackage.arro.F(r5, r0)
            if (r5 == r1) goto L71
        L65:
            r5.getClass()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = defpackage.arsd.k(r5)
            nfw r5 = (defpackage.nfw) r5
        L70:
            return r5
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyz.g(arpe):java.lang.Object");
    }

    public final arqg h(zbe zbeVar) {
        return new yzg(this, 200L, new quz(this, zbeVar, 14), 0);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [arwe, java.lang.Object] */
    public final void i(zbe zbeVar) {
        if (!zbeVar.c()) {
            if (zbeVar.b() && ((Boolean) zbeVar.s.c()).booleanValue()) {
                return;
            }
            Object obj = ((zbk) this.k).d;
            if (obj != null) {
                ((mdg) obj).b();
            }
            zem d = ((zen) this.e).d();
            List list = d.a;
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChipData) it.next()).a);
            }
            if (d.d == zep.c) {
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (arrayList.size() >= 2) {
                if (!d.d.a()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (arrayList.size() == 1) {
                qjh.l(this.g, null, new jvy(this, arrayList, (arpe) null, 4), 3);
                return;
            } else {
                qjh.l(this.g, null, new uqm(this, arrayList, zbeVar, (arpe) null, 2), 3);
                return;
            }
        }
        zbeVar.r.f(true);
        zbk zbkVar = zbeVar.j;
        ((ijp) zbkVar.b).d(8, zbkVar.a);
    }

    public final arqg j(mkh mkhVar, int i, zep zepVar, boolean z) {
        return new yzg(this, 100L, new yze(this, mkhVar, z, i, zepVar), 0);
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    public final Bundle k(int i) {
        String str;
        zke zkeVar;
        if (((Boolean) zke.a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            synchronized (this.k) {
                Object obj = this.c;
                Integer valueOf = Integer.valueOf(i);
                zkeVar = (zke) ((HashMap) obj).get(valueOf);
                if (zkeVar == null) {
                    zkeVar = ((zbl) this.g.b()).a(i);
                    ((HashMap) this.c).put(valueOf, zkeVar);
                }
            }
            p(bundle, zkeVar.e(), "mms_auto_retrieve_enabled_bool");
            p(bundle, zkeVar.f(), "mmsRoamingAutoRetrieveByDefault");
            p(bundle, zkeVar.i(), "enableWapPushSI");
            p(bundle, zkeVar.g(), "enableGroupMms");
            p(bundle, zkeVar.k(), "smsUsesSimpleCharactersOnly");
            p(bundle, zkeVar.h(), "enableSMSDeliveryReports");
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        Context context = (Context) this.m;
        String string = context.getString(R.string.group_mms_pref_key);
        String string2 = context.getString(R.string.auto_retrieve_mms_pref_key);
        String string3 = context.getString(R.string.auto_retrieve_mms_when_roaming_pref_key);
        String string4 = context.getString(R.string.delivery_reports_pref_key);
        String string5 = context.getString(R.string.sms_encoding_pref_key);
        String string6 = context.getString(R.string.wap_push_si_pref_key);
        alok alokVar = new alok();
        alokVar.h(string, "enableGroupMms");
        alokVar.h(string2, "mms_auto_retrieve_enabled_bool");
        alokVar.h(string3, "allowChangingMmsRoamingAutoRetrieve");
        alokVar.h(string4, "enableSMSDeliveryReports");
        alokVar.h(string5, "smsUsesSimpleCharactersOnly");
        alokVar.h(string6, "enableWapPushSI");
        alor b = alokVar.b();
        ykw x = ((zxy) this.d.b()).x(i);
        Bundle ax = d.ax();
        aluq listIterator = b.keySet().listIterator();
        while (listIterator.hasNext()) {
            String str2 = (String) listIterator.next();
            if (x.p(str2) && (str = (String) b.get(str2)) != null) {
                bundle2.putBoolean(str, x.q(str2, ax.getBoolean(str, false)));
            }
        }
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [msh, java.lang.Object] */
    public final String l() {
        String str;
        Stream map = Collection.EL.stream(((yjy) this.j.b()).l()).map(new wmi(16));
        int i = alog.d;
        alog alogVar = (alog) map.collect(alls.a);
        StringBuilder sb = new StringBuilder();
        int size = alogVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) alogVar.get(i2)).intValue();
            Optional j = ((yjy) this.j.b()).h(intValue).j(true);
            if (!j.isEmpty() && !j.get().w()) {
                str = "non-empty (redacted)\n";
            } else {
                str = "empty\n";
            }
            sb.append("Carrier config values based on subId: " + intValue + ":\nLine number: " + str + ((String) Collection.EL.stream(m(intValue, true).entrySet()).map(new wmi(15)).collect(Collectors.joining("\n"))));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [armf, java.lang.Object] */
    public final TreeMap m(int i, boolean z) {
        Bundle c;
        TreeMap treeMap = new TreeMap();
        o(d.ax(), treeMap, xar.DEFAULTS);
        if (this.f.b() != null) {
            xan xanVar = (xan) this.f.b();
            xanVar.getClass();
            Bundle bundle = new Bundle();
            if (((znj) this.b.b()).W()) {
                bundle = ((xbo) this.l.b()).a(i);
            } else {
                xanVar.d(i, bundle, R.xml.mms_config);
            }
            o(bundle, treeMap, xar.BUGLE_MMS_CONFIG);
            Bundle bundle2 = new Bundle();
            if (((znj) this.b.b()).W()) {
                bundle2 = ((xbo) this.e.b()).a(i);
            } else {
                xanVar.e(i, bundle2);
            }
            o(bundle2, treeMap, xar.OEM_SPECIFIC_OVERRIDE);
            if (z) {
                if (((znj) this.b.b()).W()) {
                    c = ((xbt) this.a.b()).a(i);
                } else {
                    c = xan.c(i, (yjy) this.j.b());
                }
                if (c != null) {
                    o(c, treeMap, xar.PLATFORM);
                }
            }
            if (((znj) this.b.b()).W()) {
                o(((xbg) this.i.b()).a(i), treeMap, xar.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG);
            } else {
                o(xanVar.b(xbn.a), treeMap, xar.SERVER_SIDE_OVERRIDE_PHENOTYPE);
                if (((Boolean) xan.b.e()).booleanValue()) {
                    o(xanVar.b(xan.c), treeMap, xar.EXPERIMENT_OVERRIDE);
                }
            }
        }
        o(k(i), treeMap, xar.USER_SETTING);
        o((Bundle) this.h, treeMap, xar.DEBUG_MENU);
        return treeMap;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [armf, java.lang.Object] */
    public final aasm n(cg cgVar, aatq aatqVar, AttachmentQueueState attachmentQueueState, aaqa aaqaVar, aapk aapkVar, aabz aabzVar, ContentGridView contentGridView, int i, long j, alhr alhrVar) {
        Context context = (Context) this.m.b();
        context.getClass();
        inx inxVar = (inx) this.f.b();
        xnv xnvVar = (xnv) this.c.b();
        xnvVar.getClass();
        ksi ksiVar = (ksi) this.k.b();
        ksiVar.getClass();
        yjf yjfVar = (yjf) this.i.b();
        yjfVar.getClass();
        anen anenVar = (anen) this.h.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.d.b();
        anenVar2.getClass();
        abbu abbuVar = (abbu) this.a.b();
        abbuVar.getClass();
        ibs ibsVar = (ibs) this.l.b();
        ibsVar.getClass();
        kor korVar = (kor) this.b.b();
        korVar.getClass();
        kor korVar2 = (kor) this.j.b();
        cgVar.getClass();
        aatqVar.getClass();
        attachmentQueueState.getClass();
        aapkVar.getClass();
        return new aasm(context, inxVar, xnvVar, ksiVar, yjfVar, this.e, anenVar, anenVar2, abbuVar, ibsVar, korVar, korVar2, this.g, cgVar, aatqVar, attachmentQueueState, aaqaVar, aapkVar, aabzVar, contentGridView, i, j, alhrVar);
    }

    public yyz(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.k = new Object();
        this.m = context;
        this.j = armfVar;
        this.d = armfVar2;
        this.f = armfVar3;
        this.h = new Bundle();
        this.g = armfVar4;
        this.e = armfVar5;
        this.l = armfVar6;
        this.a = armfVar7;
        this.i = armfVar8;
        this.b = armfVar9;
        this.c = new HashMap();
        if (airu.a == null) {
            synchronized (airu.class) {
                if (airu.a == null) {
                    int i = airt.a;
                    airu.a = new airs();
                }
            }
        }
    }

    public yyz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, agnq agnqVar, armf armfVar9, armf armfVar10, arpi arpiVar, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        agnqVar.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        this.l = armfVar;
        this.k = armfVar2;
        this.f = armfVar3;
        this.b = armfVar4;
        this.m = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.g = armfVar8;
        this.c = agnqVar;
        this.h = armfVar9;
        this.a = armfVar10;
        this.e = arpiVar;
        this.d = arweVar;
    }

    public yyz(apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        this.c = apwtVar;
        this.f = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = armfVar9;
        this.m = armfVar10;
        cg cgVar = (cg) armfVar.b();
        arml b = armd.b(3, new yyy(new yyy(cgVar, 0), 2));
        int i = arsc.a;
        this.d = new eot(new arrh(StartChatViewModel.class), new yyy(b, 3), new quz(cgVar, b, 12), new yyy(b, 4));
        this.e = armd.a(new yyy(this, 1));
    }

    public yyz(arwe arweVar, ConversationId conversationId, zcr zcrVar, zen zenVar, zap zapVar, aksr aksrVar, zcf zcfVar, zbk zbkVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        arweVar.getClass();
        zcrVar.getClass();
        zenVar.getClass();
        zapVar.getClass();
        aksrVar.getClass();
        zcfVar.getClass();
        zbkVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.g = arweVar;
        this.m = conversationId;
        this.l = zcrVar;
        this.e = zenVar;
        this.f = zapVar;
        this.c = aksrVar;
        this.i = zcfVar;
        this.k = zbkVar;
        this.h = armfVar;
        this.j = armfVar2;
        this.d = armfVar3;
        this.b = armfVar4;
        this.a = armfVar5;
    }

    public yyz(Context context, arwe arweVar, arwe arweVar2, asai asaiVar, asai asaiVar2, lkd lkdVar, ajwt ajwtVar, wfh wfhVar, zoh zohVar, ndi ndiVar, miw miwVar, armf armfVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        lkdVar.getClass();
        ajwtVar.getClass();
        wfhVar.getClass();
        zohVar.getClass();
        ndiVar.getClass();
        miwVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.m = context;
        this.j = arweVar;
        this.d = arweVar2;
        this.h = asaiVar;
        this.g = asaiVar2;
        this.f = lkdVar;
        this.c = ajwtVar;
        this.l = wfhVar;
        this.e = zohVar;
        this.i = ndiVar;
        this.k = miwVar;
        this.b = armfVar;
        this.a = armfVar2;
    }

    public yyz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.l = armfVar3;
        armfVar4.getClass();
        this.m = armfVar4;
        armfVar5.getClass();
        this.i = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        armfVar7.getClass();
        this.j = armfVar7;
        armfVar8.getClass();
        this.g = armfVar8;
        armfVar9.getClass();
        this.b = armfVar9;
        armfVar10.getClass();
        this.h = armfVar10;
        armfVar11.getClass();
        this.a = armfVar11;
        armfVar12.getClass();
        this.d = armfVar12;
        armfVar13.getClass();
        this.k = armfVar13;
    }

    public yyz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, byte[] bArr) {
        armfVar.getClass();
        this.m = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.k = armfVar4;
        armfVar5.getClass();
        this.i = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        this.d = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
        armfVar10.getClass();
        this.l = armfVar10;
        armfVar11.getClass();
        this.b = armfVar11;
        armfVar12.getClass();
        this.j = armfVar12;
        armfVar13.getClass();
        this.g = armfVar13;
    }
}
