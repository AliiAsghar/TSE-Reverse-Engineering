package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhg {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh");
    static final utz b = uuh.i(uuh.b, "disable_logging_participant_refresh", false);
    public static final xze c = xze.g("BugleDataModel", "ParticipantRefresh");
    public static final tay d;
    private final armf A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    public final armf e;
    public final agnq f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final anen n;
    public final osp o;
    private final armf p;
    private final uhf q;
    private final armf r;
    private final Context s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;

    static {
        uuh.i(uuh.b, "enable_overriding_normalized_destination_only_with_valid_destination", true);
        taz e = ParticipantsTable.e();
        e.w("SELF_PARTICIPANTS_WITH_INVALID_SIM_SLOT_ID_QUERY");
        e.c(ParticipantsTable.c.a);
        e.g(new ugo(17));
        d = e.b();
    }

    public uhg(armf armfVar, uhf uhfVar, armf armfVar2, Context context, armf armfVar3, armf armfVar4, armf armfVar5, agnq agnqVar, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, anen anenVar, osp ospVar) {
        this.p = armfVar;
        this.q = uhfVar;
        this.r = armfVar2;
        this.s = context;
        this.t = armfVar3;
        this.u = armfVar4;
        this.e = armfVar5;
        this.f = agnqVar;
        this.g = armfVar6;
        this.v = armfVar8;
        this.w = armfVar7;
        this.x = armfVar9;
        this.h = armfVar10;
        this.y = armfVar11;
        this.i = armfVar12;
        this.z = armfVar13;
        this.A = armfVar14;
        this.B = armfVar15;
        this.C = armfVar16;
        this.D = armfVar17;
        this.E = armfVar18;
        this.F = armfVar19;
        this.j = armfVar20;
        this.k = armfVar21;
        this.l = armfVar22;
        this.m = armfVar23;
        this.G = armfVar24;
        this.n = anenVar;
        this.o = ospVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        uhf uhfVar = this.q;
        if (uhfVar.c.compareAndSet(false, true)) {
            c.o("ContactContentObserver initialize");
            uhfVar.a.getContentResolver().registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, uhfVar);
            uhfVar.b.set(true);
        }
    }

    public final void b(final alog alogVar) {
        this.f.e("ParticipantRefresh#refreshConversationsSelfIds", new Runnable() { // from class: uhd
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
            
                if (j$.util.Collection.EL.stream(((defpackage.rur) r7.j.b()).e(r5.C())).map(new defpackage.tyl(r7, 15)).anyMatch(new defpackage.uhe(r13, r10)) == false) goto L17;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01aa A[LOOP:0: B:6:0x0073->B:16:0x01aa, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0187 A[EDGE_INSN: B:17:0x0187->B:18:0x0187 BREAK  A[LOOP:0: B:6:0x0073->B:16:0x01aa], SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 457
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uhd.run():void");
            }
        });
    }

    public final void c(ParticipantsTable.BindData bindData) {
        Integer valueOf;
        Integer valueOf2;
        tbb f = ParticipantsTable.f();
        f.aj("ParticipantRefresh#updateParticipant");
        f.B(bindData.O());
        f.i(bindData.s());
        f.w(bindData.N());
        f.q(bindData.L());
        f.o(bindData.K());
        f.D(bindData.v());
        f.e(lru.g(bindData).b);
        f.n(lru.g(bindData).c);
        int n = bindData.n();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 12001) {
            agnc.t("participant_type", intValue2);
        }
        if (intValue >= 12001) {
            f.a.put("participant_type", Integer.valueOf(n));
        }
        f.g(bindData.H());
        f.F(bindData.P());
        f.J(bindData.Q());
        f.l(bindData.t());
        f.A(bindData.w());
        if (((Boolean) this.A.b()).booleanValue()) {
            f.C(bindData.C());
            f.z(bindData.B());
        } else {
            f.C(vox.PROFILE_UNSPECIFIED_SOURCE);
            f.z(vox.PROFILE_UNSPECIFIED_SOURCE);
        }
        if (ryg.l(bindData)) {
            f.m(bindData.J());
        }
        String M = bindData.M();
        if (M != null) {
            this.f.e("ParticipantRefresh#updateParticipant", new eex(this, bindData, f, M, 20));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (((yjf) this.u.b()).f() && ((yjf) this.u.b()).i()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011a A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:3:0x000a, B:5:0x0013, B:9:0x0028, B:11:0x002f, B:14:0x004a, B:17:0x01fd, B:20:0x0206, B:27:0x0064, B:29:0x0085, B:31:0x00a4, B:33:0x00aa, B:34:0x0113, B:36:0x011a, B:38:0x011e, B:41:0x0153, B:43:0x0169, B:44:0x018f, B:47:0x01e2, B:67:0x01df, B:66:0x01dc, B:68:0x0179, B:70:0x01e7, B:71:0x012b, B:73:0x012f, B:74:0x0133, B:76:0x013b, B:77:0x0143, B:79:0x014f, B:81:0x00f9), top: B:2:0x000a, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169 A[Catch: Exception -> 0x01e6, all -> 0x0213, TryCatch #4 {Exception -> 0x01e6, blocks: (B:41:0x0153, B:43:0x0169, B:44:0x018f, B:47:0x01e2, B:67:0x01df, B:66:0x01dc, B:68:0x0179), top: B:40:0x0153, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2 A[Catch: Exception -> 0x01e6, all -> 0x0213, TRY_LEAVE, TryCatch #4 {Exception -> 0x01e6, blocks: (B:41:0x0153, B:43:0x0169, B:44:0x018f, B:47:0x01e2, B:67:0x01df, B:66:0x01dc, B:68:0x0179), top: B:40:0x0153, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179 A[Catch: Exception -> 0x01e6, all -> 0x0213, TryCatch #4 {Exception -> 0x01e6, blocks: (B:41:0x0153, B:43:0x0169, B:44:0x018f, B:47:0x01e2, B:67:0x01df, B:66:0x01dc, B:68:0x0179), top: B:40:0x0153, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:3:0x000a, B:5:0x0013, B:9:0x0028, B:11:0x002f, B:14:0x004a, B:17:0x01fd, B:20:0x0206, B:27:0x0064, B:29:0x0085, B:31:0x00a4, B:33:0x00aa, B:34:0x0113, B:36:0x011a, B:38:0x011e, B:41:0x0153, B:43:0x0169, B:44:0x018f, B:47:0x01e2, B:67:0x01df, B:66:0x01dc, B:68:0x0179, B:70:0x01e7, B:71:0x012b, B:73:0x012f, B:74:0x0133, B:76:0x013b, B:77:0x0143, B:79:0x014f, B:81:0x00f9), top: B:2:0x000a, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [msh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.tap r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhg.e(tap):boolean");
    }

    public final boolean f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        boolean ai = ((rtz) this.p.b()).ai(conversationIdType, selfIdentityId);
        if (ai) {
            ((uhj) this.t.b()).d(conversationIdType);
        }
        qop.b(this.s, conversationIdType, selfIdentityId);
        return ai;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [armf, java.lang.Object] */
    public final boolean g(tap tapVar, int i) {
        Optional empty;
        Object next;
        int i2;
        boolean z;
        Optional of;
        boolean z2;
        String n;
        boolean z3;
        String uri;
        Uri parse;
        int i3;
        long j = tapVar.q;
        String str = tapVar.f;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        msh q = ((msk) this.h.b()).q(tapVar.a());
        int i4 = 3;
        if (TextUtils.isEmpty(tapVar.g)) {
            empty = Optional.empty();
        } else {
            long j2 = tapVar.q;
            try {
                Cursor c2 = ((yce) this.r.b()).c(q);
                try {
                    alob alobVar = new alob();
                    while (c2 != null && c2.moveToNext()) {
                        int position = c2.getPosition();
                        if (position >= 0 && position < c2.getCount()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.U(z, "Cursor position out of bounds!");
                        String string = c2.getString(i4);
                        if (Objects.isNull(string)) {
                            of = Optional.empty();
                        } else {
                            msh n2 = ((msk) this.h.b()).n(string);
                            String string2 = c2.getString(1);
                            long j3 = c2.getLong(0);
                            String string3 = c2.getString(2);
                            String string4 = c2.getString(6);
                            if (string4 != null) {
                                of = Optional.of(new uha(n2, string2, j3, string3, string4));
                            } else {
                                throw new NullPointerException("Null lookupKey");
                            }
                        }
                        of.ifPresent(new ter(alobVar, 18));
                        i4 = 3;
                    }
                    alog g = alobVar.g();
                    g.getClass();
                    alur it = g.iterator();
                    if (!it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (it.hasNext()) {
                            int e = uho.e(j2, q, (uha) next);
                            while (true) {
                                Object next2 = it.next();
                                int e2 = uho.e(j2, q, (uha) next2);
                                if (e < e2) {
                                    i2 = e2;
                                } else {
                                    i2 = e;
                                }
                                if (e < e2) {
                                    next = next2;
                                }
                                if (!it.hasNext()) {
                                    break;
                                }
                                e = i2;
                            }
                        }
                    }
                    empty = Optional.ofNullable((uha) next);
                    if (c2 != null) {
                        c2.close();
                    }
                } finally {
                }
            } catch (SQLiteException e3) {
                c.n(String.format("Catching SQLiteException encountered querying CP2 for MI: %s", q), e3);
                empty = Optional.empty();
            }
        }
        if (empty.isEmpty()) {
            if (j == -2 || j == -4) {
                return false;
            }
            ((lru) this.y.b()).h(tapVar);
            c.o("No match contact, clear contact info");
            ((mbl) this.B.b()).c("Bugle.Datamodel.ParticipantRefresh.RecipientsUnmatched.Count");
            if (!((yjy) this.F.b()).j().F()) {
                return true;
            }
            ((mbl) this.B.b()).c("Bugle.Datamodel.ParticipantRefresh.RecipientsUnmatchedRoaming.Count");
            return true;
        }
        uha uhaVar = (uha) empty.get();
        if (!TextUtils.isEmpty(tapVar.r) && !TextUtils.equals(uhaVar.e, tapVar.r)) {
            z2 = true;
        } else {
            z2 = false;
        }
        msh mshVar = uhaVar.a;
        if (((opa) this.E.b()).a()) {
            n = q.k();
        } else {
            n = q.n();
        }
        if (q.equals(mshVar) && TextUtils.equals(str, n)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 && z3) {
            ((lru) this.y.b()).h(tapVar);
            c.o("Matched a different contact, clear contact info");
            return true;
        }
        String str2 = tapVar.m;
        String str3 = tapVar.n;
        Uri uri2 = tapVar.o;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        long j4 = uhaVar.c;
        boolean equals = TextUtils.equals(uhaVar.b, str2);
        boolean equals2 = TextUtils.equals(uhaVar.d, uri);
        String b2 = ((yce) this.r.b()).b(uhaVar.c);
        boolean equals3 = TextUtils.equals(b2, str3);
        tapVar.k(mshVar.m());
        String str4 = uhaVar.d;
        if (j4 == j && !z2 && equals && equals3 && equals2) {
            return false;
        }
        tapVar.l(uhaVar.c);
        tapVar.C(uhaVar.e);
        if (((Boolean) this.A.b()).booleanValue()) {
            ((vyv) this.z.b()).o(tapVar, str4);
            vyv.p(tapVar, uhaVar.b, b2);
        } else {
            if (str4 == null) {
                parse = null;
            } else {
                parse = Uri.parse(str4);
            }
            tapVar.M(parse);
            tapVar.u(uhaVar.b);
            tapVar.t(b2);
        }
        if (TextUtils.isEmpty(uhaVar.d)) {
            ((lru) this.y.b()).i(tapVar);
        } else {
            lru.j(tapVar, new ParticipantColor(0, lru.g(tapVar.a()).b, 0));
        }
        lfl lflVar = (lfl) this.w.b();
        ParticipantsTable.BindData a2 = tapVar.a();
        switch (lflVar.q(((msk) lflVar.c.b()).s(a2), vcp.k(a2)).ordinal()) {
            case 3:
                i3 = 3;
                break;
            case 4:
            case 14:
            default:
                i3 = 1;
                break;
            case 5:
                i3 = 2;
                break;
            case 6:
                i3 = 4;
                break;
            case 7:
                i3 = 5;
                break;
            case 8:
                i3 = 6;
                break;
            case 9:
                i3 = 7;
                break;
            case 10:
                i3 = 8;
                break;
            case 11:
                i3 = 9;
                break;
            case 12:
                i3 = 10;
                break;
            case 13:
                i3 = 11;
                break;
            case 15:
                i3 = 12;
                break;
        }
        if (((Boolean) b.e()).booleanValue()) {
            return true;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONTACTS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amqu.a.createBuilder();
        aozy createBuilder2 = amqt.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amqt amqtVar = (amqt) apagVar;
        amqtVar.c = i3 - 1;
        amqtVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amqt amqtVar2 = (amqt) createBuilder2.b;
        amqtVar2.d = i - 1;
        amqtVar2.b |= 2;
        amqt amqtVar3 = (amqt) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amqu amquVar = (amqu) createBuilder.b;
        amqtVar3.getClass();
        amquVar.c = amqtVar3;
        amquVar.b = 1;
        amqu amquVar2 = (amqu) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amquVar2.getClass();
        amfrVar2.aq = amquVar2;
        amfrVar2.d |= 4194304;
        ((maq) this.v.b()).j(amfqVar);
        return true;
    }
}
