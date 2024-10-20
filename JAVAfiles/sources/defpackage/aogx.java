package defpackage;

import android.os.RemoteException;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityService;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aogx implements aciq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aogx(abxd abxdVar, GenerateInviteLinkRequest generateInviteLinkRequest, abwv abwvVar, int i) {
        this.d = i;
        this.b = abxdVar;
        this.c = generateInviteLinkRequest;
        this.a = abwvVar;
    }

    @Override // defpackage.aciq
    public final acir a(Object obj) {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                aoip aoipVar = firebaseMessaging.g;
                String str = (String) obj;
                FirebaseMessaging.k(firebaseMessaging.d).c(firebaseMessaging.c(), (String) this.c, str, aoipVar.c());
                Object obj2 = this.b;
                if (obj2 == null || !str.equals(((aoit) obj2).b)) {
                    firebaseMessaging.d(str);
                }
                return actx.s(str);
            }
            IReachabilityService iReachabilityService = (IReachabilityService) obj;
            acit acitVar = new acit();
            boolean c = ((abwv) this.a).c();
            Object obj3 = this.c;
            Object obj4 = this.b;
            try {
                if (c) {
                    iReachabilityService.generateMeetingInviteLink(alog.r(((GenerateInviteLinkRequest) obj3).a.b), new abxc((abxd) obj4, acitVar, true));
                } else {
                    iReachabilityService.generateInviteLink(alog.r(((GenerateInviteLinkRequest) obj3).a.b), new abxc((abxd) obj4, acitVar, false));
                }
            } catch (RemoteException unused) {
                acak acakVar = ((abxd) obj4).b;
                if (true != c) {
                    i = 15;
                } else {
                    i = 16;
                }
                acakVar.h(i);
                acitVar.a(new IllegalStateException("Failed to query Meet reachability service"));
            }
            return (acir) acitVar.a;
        }
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.a;
        aogz aogzVar = firebaseInstanceId.d;
        String str2 = (String) obj;
        asqe asqeVar = FirebaseInstanceId.g;
        String f = firebaseInstanceId.f();
        Object obj5 = this.c;
        asqeVar.g(f, (String) this.b, (String) obj5, str2, aogzVar.c());
        return actx.s(new aojh(str2));
    }

    public /* synthetic */ aogx(FirebaseInstanceId firebaseInstanceId, String str, String str2, int i) {
        this.d = i;
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ aogx(FirebaseMessaging firebaseMessaging, String str, aoit aoitVar, int i) {
        this.d = i;
        this.a = firebaseMessaging;
        this.c = str;
        this.b = aoitVar;
    }
}
