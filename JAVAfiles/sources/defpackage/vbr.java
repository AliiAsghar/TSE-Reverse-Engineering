package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbr implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public vbr(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        switch (this.c) {
            case 0:
                alvw i = vbs.a.i();
                i.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) ((alvg) i).g(th);
                alvgVar.Z(alwk.FULL);
                alvgVar.X(ydl.D, this.a);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache$1", "onFailure", 137, "PhoneRegistrationProviderCache.java")).q("Failed to create phone registration provider cache.");
                synchronized (((vbs) this.b).b) {
                    ((vbs) this.b).c.remove(this.a);
                }
                return;
            case 1:
                alvg alvgVar2 = (alvg) ujc.a.g();
                alvgVar2.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.b);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$1", "onFailure", 229, "RichCardMediaDownloadServiceDownloader.java")).q("Failed to cancel download.");
                ujd ujdVar = (ujd) ((ujc) this.a).e.a.remove(this.b);
                if (ujdVar != null) {
                    ujdVar.b((Uri) this.b, new RuntimeException(th));
                    return;
                }
                return;
            case 2:
                ReportIssueReceiver.a.r("Failed to start feedback from ReportIssueReceiver", th);
                return;
            case 3:
                alvw d = aabd.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$1", "onFailure", 106, "ResourceBasedEmojiVariantService.java")).D("Failed to persist %1$s as the preferred emoji variant for %2$s.", this.a, this.b);
                return;
            case 4:
                ((alwl) ((alwl) ((alwl) ((adeb) this.b).a.i()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onFailure", 112, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
                return;
            case 5:
                ((alwl) ((alwl) ((alwl) ((adeb) this.b).a.i()).g(th)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onFailure", 115, "CreateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
                return;
            case 6:
                ((alwl) ((alwl) ((alwl) ((adeb) this.b).a.i()).g(th)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor$1", "onFailure", 108, "RemoveUserFromGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
                return;
            case 7:
                alwl alwlVar = (alwl) ((alwl) ((alwl) ((adeh) this.a).a.i()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onFailure", 136, "SendMessageOperationResultProcessor.java");
                wda wdaVar = ((wdp) this.b).f;
                if (wdaVar == null) {
                    wdaVar = wda.a;
                }
                alwlVar.D("[%s] Error while notifying operation completed: %s", wdaVar.c, th);
                return;
            case 8:
                ((alwl) ((alwl) ((alwl) ((adeb) this.b).a.i()).g(th)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onFailure", 108, "TriggerGroupNotificationOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
                return;
            case 9:
                ((alwl) ((alwl) ((alwl) ((adeb) this.b).a.i()).g(th)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onFailure", 108, "UpdateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
                return;
            case 10:
                ((alvg) ((alvg) ((alvg) aguj.a.i()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onFailure", 'X', "DefaultGlobalPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
                return;
            case 11:
                ((alvg) ((alvg) ((alvg) aguk.a.i()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onFailure", (char) 147, "DefaultStickyPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
                return;
            case 12:
                if (th instanceof CancellationException) {
                    Log.d("ExpressiveStickerClient", "Sticker search cancelled.", th);
                    return;
                }
                Log.w("ExpressiveStickerClient", "Sticker search failed.", th);
                Object obj = this.b;
                Object obj2 = this.a;
                airh airhVar = (airh) ((aiqj) obj).g;
                airhVar.c = obj2;
                airhVar.c(23);
                return;
            case 13:
                if (th instanceof CancellationException) {
                    Log.d("ExpressiveStickerClient", "ListStickerPacks cancelled.");
                    return;
                }
                Log.w("ExpressiveStickerClient", "ListStickerPacks failed.", th);
                Object obj3 = this.b;
                Object obj4 = this.a;
                airh airhVar2 = (airh) ((aiqj) obj3).g;
                airhVar2.c = obj4;
                airhVar2.c(5);
                return;
            case 14:
                airr airrVar = (airr) this.a;
                airrVar.m = !airrVar.m;
                airrVar.h.setClickable(true);
                return;
            case 15:
                Log.e("NetworkCallerGrpc", "Failed to get survey startup config.", th);
                aiyw.a.b = false;
                ((aizi) this.a).e();
                ((aizi) this.a).k((aoij) this.b);
                return;
            case 16:
                if (((alcm) this.b).d != null) {
                    aats aatsVar = ((alcm) this.b).d;
                    aatsVar.g(false);
                    aatsVar.a.L(amqf.FAILED_TO_LOAD);
                    return;
                }
                return;
            case 17:
                ((aold) this.b).c = true;
                ((apsd) this.a).a(Status.c(th), new aqut());
                return;
            default:
                ((aqxf) this.a).e(th);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        String string;
        switch (this.c) {
            case 0:
                return;
            case 1:
                ujd ujdVar = (ujd) ((ujc) this.a).e.a.remove(this.b);
                if (ujdVar != null) {
                    Object obj2 = this.b;
                    Iterator it = ujdVar.b.iterator();
                    while (it.hasNext()) {
                        ujdVar.c(new ryv((uji) it.next(), obj2, 15, null));
                    }
                    ujdVar.b.clear();
                    return;
                }
                return;
            case 2:
                ((kor) ((ReportIssueReceiver) this.b).e.b()).f((ammf) this.a);
                return;
            case 3:
                alvw d = aabd.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$1", "onSuccess", 99, "ResourceBasedEmojiVariantService.java")).D("Finished persisting %1$s as preferred emoji variant for %2$s.", this.a, this.b);
                return;
            case 4:
                ((alwl) ((alwl) ((adeb) this.b).a.g()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onSuccess", 107, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
                return;
            case 5:
                ((alwl) ((alwl) ((adeb) this.b).a.g()).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onSuccess", 110, "CreateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
                return;
            case 6:
                ((alwl) ((alwl) ((adeb) this.b).a.g()).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor$1", "onSuccess", 103, "RemoveUserFromGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
                return;
            case 7:
                alwl alwlVar = (alwl) ((alwl) ((adeh) this.a).a.g()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onSuccess", 131, "SendMessageOperationResultProcessor.java");
                wda wdaVar = ((wdp) this.b).f;
                if (wdaVar == null) {
                    wdaVar = wda.a;
                }
                alwlVar.t("[%s] Notification completed.", wdaVar.c);
                return;
            case 8:
                ((alwl) ((alwl) ((adeb) this.b).a.g()).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onSuccess", 103, "TriggerGroupNotificationOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
                return;
            case 9:
                ((alwl) ((alwl) ((adeb) this.b).a.g()).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onSuccess", 103, "UpdateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
                return;
            case 10:
                if (!((Boolean) agur.c.b()).booleanValue()) {
                    ((alvg) ((alvg) agur.a.c()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backupForGlobalPreference", 70, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
                } else {
                    Object obj3 = this.b;
                    String j = amcn.e.j(((aoyj) this.a).toByteArray());
                    ((aguj) obj3).c.a().i("emoji_variant_global_prefs", j);
                    if (!TextUtils.isEmpty(j)) {
                        alvi alviVar = agzo.a;
                        agzn.a.b(aguu.a, 2);
                    }
                }
                ((alvg) ((alvg) aguj.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onSuccess", 83, "DefaultGlobalPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
                return;
            case 11:
                ((alvg) ((alvg) aguk.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onSuccess", 141, "DefaultStickyPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
                alor j2 = alor.j(DesugarCollections.unmodifiableMap(((agut) this.a).b));
                if (!((Boolean) agur.c.b()).booleanValue()) {
                    ((alvg) ((alvg) agur.a.c()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 108, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
                    return;
                }
                HashSet hashSet = new HashSet();
                aluq listIterator = j2.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    hashSet.add(agur.b.f(entry.getKey(), entry.getValue(), new Object[0]));
                }
                ((aguk) this.b).d.a().g.a().putStringSet("emoji_variant_prefs", hashSet).apply();
                if (!j2.isEmpty()) {
                    alvi alviVar2 = agzo.a;
                    agzn.a.b(aguu.a, 0);
                }
                ((alvg) ((alvg) agur.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 123, "EmojiVariantPreferencesBackupHelper.java")).q("Backed up emoji variant preferences to SharedPreferences");
                return;
            case 12:
                Log.v("ExpressiveStickerClient", "Sticker search succeeded.");
                Object obj4 = this.a;
                airh airhVar = (airh) ((aiqj) this.b).g;
                airhVar.c = obj4;
                airhVar.c(22);
                return;
            case 13:
                Log.i("ExpressiveStickerClient", "ListStickerPacks succeeded.");
                Object obj5 = this.a;
                airh airhVar2 = (airh) ((aiqj) this.b).g;
                airhVar2.c = obj5;
                airhVar2.c(4);
                return;
            case 14:
                ((airr) this.a).h.setClickable(true);
                ((airr) this.a).b();
                Object obj6 = this.a;
                Context context = ((View) this.b).getContext();
                if (((airr) obj6).m) {
                    string = context.getString(R.string.announcement_sticker_added_to_favorites);
                } else {
                    string = context.getString(R.string.announcement_sticker_removed_from_favorites);
                }
                ahmc.M((View) this.b, string);
                return;
            case 15:
                aiyw aiywVar = aiyw.a;
                aqjl aqjlVar = ((aqjg) obj).b;
                if (aqjlVar == null) {
                    aqjlVar = aqjl.a;
                }
                aiywVar.b = aqjlVar.b;
                ((aizi) this.a).e();
                ((aizi) this.a).k((aoij) this.b);
                return;
            case 16:
                apzy apzyVar = (apzy) obj;
                if (TextUtils.equals(this.a, ((alcm) this.b).c) && ((alcm) this.b).d != null) {
                    aats aatsVar = ((alcm) this.b).d;
                    apax<apzz> apaxVar = apzyVar.b;
                    if (!TextUtils.isEmpty(aatsVar.s)) {
                        aatsVar.g(false);
                        aatu aatuVar = aatsVar.h;
                        aatuVar.d.clear();
                        for (apzz apzzVar : apaxVar) {
                            List list = aatuVar.d;
                            apzw apzwVar = apzzVar.f;
                            if (apzwVar == null) {
                                apzwVar = apzw.a;
                            }
                            Uri parse = Uri.parse(apzwVar.c);
                            apzw apzwVar2 = apzzVar.g;
                            if (apzwVar2 == null) {
                                apzwVar2 = apzw.a;
                            }
                            Uri parse2 = Uri.parse(apzwVar2.c);
                            Uri parse3 = Uri.parse(apzzVar.c);
                            String str = apzzVar.d;
                            String str2 = apzzVar.e;
                            String str3 = apzzVar.i;
                            aqaa aqaaVar = apzwVar.d;
                            if (aqaaVar == null) {
                                aqaaVar = aqaa.a;
                            }
                            int i = aqaaVar.b;
                            aqaa aqaaVar2 = apzwVar.d;
                            if (aqaaVar2 == null) {
                                aqaaVar2 = aqaa.a;
                            }
                            list.add(new GifContentItem(parse, parse2, parse3, str, str2, str3, i, aqaaVar2.c));
                        }
                        aatuVar.c = false;
                        aatuVar.p();
                        aatsVar.j.ae(0);
                        aatsVar.a.L(amqf.LOADED);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                aqru aqruVar = (aqru) obj;
                try {
                    Object obj7 = this.b;
                    ((aold) obj7).b = aqruVar;
                    Iterator it2 = ((aold) obj7).a.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    return;
                } catch (Throwable th) {
                    a(th);
                    return;
                }
            default:
                ((aqxf) this.a).f(this.b, (Status) obj);
                return;
        }
    }

    public vbr(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public vbr(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }
}
