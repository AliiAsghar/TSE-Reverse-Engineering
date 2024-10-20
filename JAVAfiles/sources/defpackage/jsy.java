package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsy implements jow {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl");
    public final arwe b;
    public final ascd c;
    public final ascv d;
    public lrc e;
    public String f;
    public boolean g;
    public final aeqa h;
    public final jxv i;
    private final Context j;
    private final obj k;
    private final ovn l;
    private final aetj m;
    private final aesh n;
    private final lre o;

    public jsy(Context context, arwe arweVar, jxv jxvVar, lre lreVar, obj objVar, ovn ovnVar) {
        context.getClass();
        arweVar.getClass();
        jxvVar.getClass();
        lreVar.getClass();
        this.j = context;
        this.b = arweVar;
        this.i = jxvVar;
        this.o = lreVar;
        this.k = objVar;
        this.l = ovnVar;
        ascd a2 = ascy.a(false);
        this.c = a2;
        jdn jdnVar = new jdn(asar.a(new idx(jxvVar.a, this, 15)), a2, new jdu(this, (arpe) null, 4), 17, null);
        int i = ascp.a;
        this.d = arrn.T(jdnVar, arweVar, asco.b, null);
        this.f = "";
        String string = context.getString(R.string.subject_urgent_text_field_hint);
        string.getClass();
        this.m = new aetj(string, this.f, new jmy(this, 13), new jsv(this, 3), 2);
        String string2 = context.getString(R.string.subject_urgent_urgent_checkbox);
        string2.getClass();
        aesh aeshVar = new aesh(string2, null, null, this.g, true, new jmy(this, 14), null, 0, 198);
        this.n = aeshVar;
        String string3 = context.getString(R.string.subject_urgent_dialog_title);
        string3.getClass();
        List y = aqjn.y(aeshVar);
        String string4 = context.getString(R.string.subject_urgent_dialog_dismiss);
        string4.getClass();
        aewr aewrVar = new aewr(string4, new jmy(this, 10));
        String string5 = context.getString(R.string.subject_urgent_dialog_confirm);
        string5.getClass();
        this.h = new aeqa(string3, y, null, null, new aewr(string5, new jmy(this, 11)), aewrVar, new jmy(this, 12), 12);
    }

    @Override // defpackage.jow
    public final void a() {
        this.c.f(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r10 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aeon b(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            obj r0 = r9.k
            aeon r8 = new aeon
            boolean r0 = r0.a()
            java.lang.String r1 = ""
            if (r0 != 0) goto L18
            ovn r0 = r9.l
            boolean r0 = r0.a()
            if (r0 == 0) goto L15
            goto L18
        L15:
            if (r10 != 0) goto L52
            goto L50
        L18:
            if (r11 == 0) goto L4e
            if (r10 == 0) goto L41
            int r0 = r10.length()
            if (r0 != 0) goto L23
            goto L41
        L23:
            android.content.Context r0 = r9.j
            r1 = 2132021751(0x7f1411f7, float:1.9681902E38)
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            r10.getClass()
            goto L52
        L41:
            android.content.Context r10 = r9.j
            r0 = 2132021753(0x7f1411f9, float:1.9681906E38)
            java.lang.String r10 = r10.getString(r0)
            r10.getClass()
            goto L52
        L4e:
            if (r10 != 0) goto L52
        L50:
            r2 = r1
            goto L53
        L52:
            r2 = r10
        L53:
            ghu r4 = new ghu
            r10 = 6
            r0 = 0
            r4.<init>(r9, r10, r0)
            ghu r5 = new ghu
            r10 = 7
            r5.<init>(r9, r10, r0)
            rl r6 = new rl
            r10 = 15
            r6.<init>(r9, r10, r0)
            rl r7 = new rl
            r10 = 16
            r7.<init>(r9, r10, r0)
            r1 = r8
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsy.b(java.lang.String, boolean):aeon");
    }

    public final aeqa c(aeqa aeqaVar) {
        return aeqa.b(aeqaVar, null, aqjn.B(aetj.a(this.m, this.f), aesh.a(this.n, null, null, null, this.g, null, 247)), null, null, null, null, 125);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ascv, java.lang.Object] */
    public final void d() {
        if (!this.k.a() && !this.l.a()) {
            alvw e = a.e();
            e.X(alwp.a, "BugleComposeRow2");
            ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl", "show", 135, "SubjectUrgentUiAdapterImpl.kt")).q("Showing subject/urgent row");
            this.c.f(true);
            return;
        }
        alvw e2 = a.e();
        e2.X(alwp.a, "BugleComposeRow2");
        ((alvg) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl", "show", 127, "SubjectUrgentUiAdapterImpl.kt")).q("Showing subject/urgent dialog");
        String str = ((jhc) this.i.a.c()).c;
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.g = ((jhc) this.i.a.c()).d;
        this.o.e(true, new jsv(this, 2));
    }
}
