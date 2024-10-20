package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vki implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ vki(acta actaVar, String str, String str2, DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase, HttpContext httpContext, int i) {
        this.g = i;
        this.e = actaVar;
        this.f = str;
        this.b = str2;
        this.d = defaultHttpClient;
        this.a = httpRequestBase;
        this.c = httpContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        Optional empty;
        Uri uri;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                Object obj2 = this.f;
                                advr.l(acta.a, "Obtained GBA credentials, making authenticated %s request.", obj2);
                                Object obj3 = this.e;
                                aphx aphxVar = aphx.AUTHENTICATION_TYPE_GBA;
                                acta actaVar = (acta) obj3;
                                acnv acnvVar = actaVar.d;
                                acnvVar.a = aphxVar;
                                acnvVar.d((String) this.b, actt.k((String) obj2), altc.a);
                                Object obj4 = this.d;
                                ((DefaultHttpClient) obj4).getCredentialsProvider().setCredentials(AuthScope.ANY, (Credentials) obj);
                                Object obj5 = this.a;
                                acta.e(((HttpRequestBase) obj5).getAllHeaders());
                                return actaVar.e.submit(new xqt(obj4, obj5, this.c, 12));
                            }
                            MessageCoreData messageCoreData = (MessageCoreData) obj;
                            Object obj6 = this.f;
                            Object obj7 = this.e;
                            Object obj8 = this.a;
                            Object obj9 = this.c;
                            Object obj10 = this.d;
                            xrf xrfVar = (xrf) obj10;
                            return xrfVar.c(messageCoreData, (xwa) obj9, (ParticipantsTable.BindData) obj8, (qei) obj7, (qwm) obj6).i(new vug(obj10, (Object) messageCoreData, this.b, obj8, 8), xrfVar.c);
                        }
                        ?? r3 = this.a;
                        ?? r1 = this.c;
                        rve E = r3.E();
                        apwq apwqVar = (apwq) r1.apply(r3);
                        Object obj11 = this.f;
                        return ((wxz) this.d).f(r3, E, (qej) obj, apwqVar, (aoia) this.e, (qgj) this.b, (qft) obj11);
                    }
                    ?? r32 = this.a;
                    ?? r12 = this.c;
                    rve E2 = r32.E();
                    apwq apwqVar2 = (apwq) r12.apply(r32);
                    Object obj12 = this.f;
                    return ((wxz) this.d).f(r32, E2, (qej) obj, apwqVar2, (aoia) this.e, (qgj) this.b, (qft) obj12);
                }
                ?? r33 = this.a;
                ?? r13 = this.c;
                rve E3 = r33.E();
                apwq apwqVar3 = (apwq) r13.apply(r33);
                Object obj13 = this.f;
                return ((wxz) this.d).f(r33, E3, (qej) obj, apwqVar3, (aoia) this.e, (qgj) this.b, (qft) obj13);
            }
            Object obj14 = this.d;
            Object obj15 = this.a;
            Object obj16 = this.f;
            return ((ttq) this.b).d.b((byte[]) this.c, (String) obj, (qei) this.e, (rve) obj16, (alog) obj15, "application/vnd.gsma.rcspushlocation+xml", false, (apwq) obj14);
        }
        ArrayList arrayList = new ArrayList();
        vjy vjyVar = (vjy) this.b;
        Optional optional = vjyVar.k;
        Object obj17 = this.a;
        if (optional.isPresent()) {
            ?? r34 = vjyVar.k.get();
            int i2 = ((alsx) r34).c;
            for (int i3 = 0; i3 < i2; i3++) {
                vlq vlqVar = (vlq) r34.get(i3);
                vlk vlkVar = ((vkl) obj17).c;
                String str = vlqVar.a;
                Uri uri2 = vlqVar.b;
                if (!vjyVar.e) {
                    uri = (Uri) vlqVar.c.orElse(null);
                } else {
                    uri = null;
                }
                arrayList.add(vlkVar.a(str, uri2, uri));
            }
        }
        Object obj18 = this.d;
        Object obj19 = this.c;
        if (!yhx.d) {
            empty = Optional.empty();
        } else if (!vjyVar.i.isEmpty() && vjyVar.h != null) {
            vkl vklVar = (vkl) obj17;
            vkn vknVar = (vkn) obj18;
            Bundle bundle = (Bundle) this.e;
            vlm vlmVar = (vlm) obj19;
            PendingIntent u = vklVar.m.u(vko.NOTIFICATION_BUBBLE_CLICKED, vlmVar, vknVar.a, (vlb) vjyVar.i.get(), false, true, bundle);
            if (u == null) {
                alwl alwlVar = (alwl) vkl.a.i();
                alwlVar.X(vjh.d, (String) vknVar.a.orElse(null));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationBuilder", "createBubbleMetadata", 383, "NotificationBuilder.java")).q("Error creating bubble intent, not creating bubble metadata");
                empty = Optional.empty();
            } else {
                IconCompat iconCompat = vjyVar.h;
                iconCompat.getClass();
                rhc rhcVar = new rhc(u, iconCompat);
                rhcVar.d(Integer.MAX_VALUE);
                vlc a = vlc.a(Optional.empty(), Optional.empty());
                vjyVar.j.isPresent();
                rhcVar.e = vklVar.m.v(vko.NOTIFICATION_BUBBLE_SWIPED, vlmVar, vknVar.a, a, true, bundle);
                empty = Optional.of(rhcVar.b());
            }
        } else {
            alwl alwlVar2 = (alwl) vkl.a.g();
            alwlVar2.X(vjh.d, (String) ((vkn) obj18).a.orElse(null));
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationBuilder", "createBubbleMetadata", 365, "NotificationBuilder.java")).q("Bubble intent missing or icon not present, not creating bubble metadata");
            empty = Optional.empty();
        }
        Object obj20 = this.f;
        empty.ifPresent(new uoa(obj20, 17));
        dyu dyuVar = (dyu) obj20;
        dyuVar.H = vjyVar.a;
        return aktp.ao(arrayList).h(new imh((vlm) obj19, (vkn) obj18, (List) arrayList, dyuVar, 9), ((vkl) obj17).i);
    }

    public /* synthetic */ vki(ttq ttqVar, byte[] bArr, qei qeiVar, rve rveVar, alog alogVar, apwq apwqVar, int i) {
        this.g = i;
        this.b = ttqVar;
        this.c = bArr;
        this.e = qeiVar;
        this.f = rveVar;
        this.a = alogVar;
        this.d = apwqVar;
    }

    public /* synthetic */ vki(vkl vklVar, vjy vjyVar, vlm vlmVar, vkn vknVar, Bundle bundle, dyu dyuVar, int i) {
        this.g = i;
        this.a = vklVar;
        this.b = vjyVar;
        this.c = vlmVar;
        this.d = vknVar;
        this.e = bundle;
        this.f = dyuVar;
    }

    public /* synthetic */ vki(wxz wxzVar, MessageCoreData messageCoreData, algk algkVar, aoia aoiaVar, qgj qgjVar, qft qftVar, int i) {
        this.g = i;
        this.d = wxzVar;
        this.a = messageCoreData;
        this.c = algkVar;
        this.e = aoiaVar;
        this.b = qgjVar;
        this.f = qftVar;
    }

    public /* synthetic */ vki(xrf xrfVar, rve rveVar, xwa xwaVar, ParticipantsTable.BindData bindData, qei qeiVar, qwm qwmVar, int i) {
        this.g = i;
        this.d = xrfVar;
        this.b = rveVar;
        this.c = xwaVar;
        this.a = bindData;
        this.e = qeiVar;
        this.f = qwmVar;
    }
}
