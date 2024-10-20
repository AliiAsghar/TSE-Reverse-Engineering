package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mti implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mti(alog alogVar, boolean z, agpj agpjVar, int i) {
        this.d = i;
        this.b = alogVar;
        this.a = z;
        this.c = agpjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [msh, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        int i = 13;
        boolean z = true;
        int i2 = 0;
        switch (this.d) {
            case 0:
                ?? r0 = this.b;
                r0.getClass();
                String[] strArr = PartsTable.a;
                String[] strArr2 = ParticipantsTable.a;
                String[] strArr3 = tom.a;
                sxy A = lgc.A("parts", "participants", "user_references", (alog) r0, 16);
                A.w("+loadMessages");
                int size = r0.size();
                for (int i3 = 0; i3 < size; i3++) {
                    A = ((mzy) r0.get(i3)).a(A);
                }
                if (this.a) {
                    A.h((atkn[]) mvg.a.c.toArray(new atkn[0]));
                } else {
                    A.h((atkn[]) mvg.a.b.toArray(new atkn[0]));
                }
                A.g(new mtl(this.c, i2));
                A.t(MessagesTable.c.a);
                return A.b().t();
            case 1:
                mkt mktVar = (mkt) this.c;
                rwd rwdVar = (rwd) mktVar.i.b();
                MessageIdType messageIdType = (MessageIdType) this.b;
                MessageCoreData u = rwdVar.u(messageIdType);
                if (u == null) {
                    alwl alwlVar = (alwl) mkt.a.i();
                    alwlVar.X(ydl.a, messageIdType.a());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "markMessageAsRead", 185, "MarkMessagesAsReadHandler.java")).q("Failed to find message data");
                    return null;
                }
                boolean z2 = this.a;
                sya syaVar = new sya();
                syaVar.aj("markMessageAsRead-messages");
                syaVar.y(true);
                syc sycVar = new syc();
                sycVar.i(u.B());
                if (z2) {
                    syaVar.o(true);
                    sycVar.b(new mfk(15), new mfk(i));
                } else {
                    sycVar.A(false);
                }
                syaVar.O(sycVar);
                if (syaVar.a().e() > 0) {
                    mktVar.c.j(u.z(), u.B(), "read");
                    mktVar.c.d(u.z());
                }
                slw slwVar = new slw();
                slwVar.aj("markMessageAsRead-conversations");
                slwVar.c();
                MessageIdType B = u.B();
                slx slxVar = new slx();
                slxVar.U(new agmd("conversation_suggestions.message_id", 1, Long.valueOf(rvc.a(B))));
                slwVar.Y(new agpw(slxVar), "conversation_suggestions-buildAndUpdateForTargetMessageId");
                mktVar.m.a(vjr.a);
                mktVar.n.f();
                return u;
            case 2:
                boolean z3 = this.a;
                ?? r1 = this.c;
                if (r1.x(z3) || !((xxh) ((rfa) this.b).D.b()).d(r1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((ttz) this.c).c.d((alog) this.b, this.a);
            case 4:
                vrj vrjVar = (vrj) this.c;
                ((vqu) vrjVar.c.b()).C();
                vrq vrqVar = vrjVar.h;
                Object obj = this.b;
                try {
                    qiu.h(((mdt) vrqVar.i.b()).b().h(new puq(vrqVar, (String) obj, this.a, ((whj) vrqVar.h.b()).a((String) obj), 4), vrqVar.c).e(IOException.class, new vip(i), vrqVar.d).e(FileNotFoundException.class, new vip(14), vrqVar.d));
                } catch (apba e) {
                    ((alvg) ((alvg) ((alvg) vrq.a.i()).g(e)).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "propagateProvisioningSuccess", 84, "RcsUpdateNotifier.java")).t("Failed to get RCS success notification state for simId: %s", advq.SIM_ID.c(obj));
                }
                return null;
            case 5:
                boolean z4 = this.a;
                Object obj2 = this.b;
                zxy zxyVar = (zxy) this.c;
                String str2 = (String) obj2;
                if (!((ykw) zxyVar.b).q(str2, z4)) {
                    ((ykw) zxyVar.b).g(str2, true);
                }
                return null;
            case 6:
                boolean z5 = this.a;
                Object obj3 = this.b;
                Object obj4 = this.c;
                IGoogleCertificatesApi iGoogleCertificatesApi = abqk.c;
                if (!z5 && abqk.b((String) obj3, (abqg) obj4, true, false).b) {
                    str = "debug cert rejected";
                } else {
                    str = "not allowed";
                }
                MessageDigest a = abvb.a("SHA-256");
                abhg.m(a);
                return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str, obj3, abvg.a(a.digest(((abqh) obj4).a)), Boolean.valueOf(z5), "244199000.false");
            default:
                ((agcp) ((aiqj) this.c).k).w((String) this.b, this.a);
                return null;
        }
    }

    public /* synthetic */ mti(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = z;
    }

    public /* synthetic */ mti(rfa rfaVar, msh mshVar, boolean z, int i) {
        this.d = i;
        this.b = rfaVar;
        this.c = mshVar;
        this.a = z;
    }

    public /* synthetic */ mti(vrj vrjVar, boolean z, String str, int i) {
        this.d = i;
        this.c = vrjVar;
        this.a = z;
        this.b = str;
    }

    public /* synthetic */ mti(boolean z, String str, abqg abqgVar, int i) {
        this.d = i;
        this.a = z;
        this.b = str;
        this.c = abqgVar;
    }
}
