package defpackage;

import android.app.ActivityManager;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abes implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ abes(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                acke ackeVar = (acke) obj;
                alwo alwoVar = abeu.a;
                akrh e = aktp.e("SyncDataToWearableAppHandler#extractConversationDataMaps");
                try {
                    tm tmVar = new tm();
                    if (ackeVar != null) {
                        try {
                            if (ackeVar.b.c()) {
                                atda atdaVar = new atda(ackeVar, 1);
                                while (atdaVar.hasNext()) {
                                    ackc ackcVar = (ackc) atdaVar.next();
                                    String path = ackcVar.a().getPath();
                                    if (path != null && path.startsWith("/bugle/conversations/")) {
                                        ConversationIdType b = ruy.b(ackcVar.a().getLastPathSegment());
                                        if (!b.b()) {
                                            akrh e2 = aktp.e("SyncDataToWearableAppHandler#extractConversationDataMaps#fromDataItem");
                                            try {
                                                tmVar.put(b, adae.h(ackcVar).a);
                                                e2.close();
                                            } catch (Throwable th) {
                                                try {
                                                    e2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } else {
                                            alwl alwlVar = (alwl) abeu.a.i();
                                            alwlVar.X(ydl.M, "SyncDataToWearableAppHandler");
                                            ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "extractConversationDataMaps", 416, "SyncDataToWearableAppHandler.java")).q("getPreviousConversations: skipping null conversationId");
                                        }
                                    }
                                }
                            }
                        } finally {
                            ackeVar.b();
                        }
                    }
                    if (ackeVar != null) {
                    }
                    e.close();
                    return tmVar;
                } catch (Throwable th3) {
                    try {
                        e.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 1:
                alwl alwlVar2 = (alwl) ((alwl) abeu.a.i()).g((Throwable) obj);
                alwlVar2.X(ydl.M, "SyncDataToWearableAppHandler");
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 630, "SyncDataToWearableAppHandler.java")).q("Failed to sync conversation list to data client.");
                return null;
            case 2:
                return abzx.a((algw) obj);
            case 3:
                abzz.f.o("apk call failed", (Exception) obj, new Object[0]);
                return alfd.a;
            case 4:
                aovl aovlVar = ((aovj) obj).g;
                if (aovlVar == null) {
                    return aovl.a;
                }
                return aovlVar;
            case 5:
                if (1 == (((aovl) obj).b & 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return algw.i((GmsDeviceComplianceResponse) obj);
            case 7:
                apjr apjrVar = ((apkc) obj).f;
                if (apjrVar == null) {
                    return apjr.a;
                }
                return apjrVar;
            case 8:
                apjp b2 = apjp.b(((apjr) obj).g);
                if (b2 == null) {
                    return apjp.NOT_SET;
                }
                return b2;
            case 9:
                apkc apkcVar = (apkc) obj;
                alor alorVar = adnt.a;
                aozy builder = apkcVar.toBuilder();
                apjy apjyVar = apkcVar.e;
                if (apjyVar == null) {
                    apjyVar = apjy.a;
                }
                aozy builder2 = apjyVar.toBuilder();
                apjp apjpVar = apjp.FALSE;
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apjy apjyVar2 = (apjy) builder2.b;
                apjyVar2.e = apjpVar.d;
                apjyVar2.b |= 4;
                apjy apjyVar3 = (apjy) builder2.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apkc apkcVar2 = (apkc) builder.b;
                apjyVar3.getClass();
                apkcVar2.e = apjyVar3;
                apkcVar2.b |= 4;
                return (apkc) builder.s();
            case 10:
                return ((aegj) obj).b;
            case 11:
                if (((aehu) obj) == aehu.FAILURE) {
                    return new gsv();
                }
                return new gsw();
            case 12:
                return (String) obj;
            case 13:
                return String.valueOf((Integer) obj);
            case 14:
                if (obj == null) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        return "0";
                    }
                    return "1";
                }
                if (obj instanceof Enum) {
                    return Integer.toString(((Enum) obj).ordinal());
                }
                return obj.toString();
            case 15:
                if (obj == null) {
                    return null;
                }
                if (obj instanceof Enum) {
                    return Integer.toString(((Enum) obj).ordinal());
                }
                return DatabaseUtils.sqlEscapeString(obj.toString());
            case 16:
                return String.valueOf((Long) obj);
            case 17:
                alvg a = agtj.a.a(agyk.a);
                a.V(1, TimeUnit.SECONDS);
                ((alvg) a.h("com/google/android/libraries/inputmethod/concurrent/Executors", "createStalledTaskDetector", 500, "Executors.java")).t("Long-running task detected: %s", (String) obj);
                return null;
            case 18:
                Stream map = Collection.EL.stream((alog) obj).map(new agnz(7));
                int i = alog.d;
                return (alog) map.collect(alls.a);
            case 19:
                return ((ahka) obj).a;
            default:
                return algw.h(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
        }
    }
}
