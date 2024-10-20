package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vgd implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vgd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, vqu] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.net.Uri] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        vje vjeVar;
        vke vkeVar;
        int i = 0;
        byte[] bArr = null;
        bArr = null;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (booleanValue) {
                    vge.a.l("Tachygram is available. Adding feature flag.");
                    ((aozy) obj2).bN(askr.TACHYGRAM);
                }
                return obj2;
            case 1:
                ((vfv) this.a).f();
                return null;
            case 2:
                alvw g = vgt.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 327, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: Acked message messageId: %s", this.a);
                return null;
            case 3:
                ((mbl) ((vhm) this.a).f.b()).e("Bugle.DefaultSmsChanged.Tachyon.State.Counts", 1);
                return null;
            case 4:
                Object obj3 = this.a;
                alwo alwoVar = vka.a;
                return new vlp((dyu) obj, vlm.NT_SUMMARY, true, Optional.of(((vll) ((Optional) obj3).get()).a));
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                Object obj4 = this.a;
                if (bitmap != null) {
                    ((dzu) obj4).b = IconCompat.f(bitmap);
                }
                return new dzv((dzu) obj4);
            case 6:
                vle vleVar = (vle) this.a;
                dzi dziVar = new dzi(vleVar.b, vleVar.c, (dzv) obj);
                if (vleVar.e.isPresent() || vleVar.d.isPresent()) {
                    String str = (String) vleVar.d.orElse(null);
                    Optional optional = vleVar.e;
                    if (gh.e((String) vleVar.d.orElse("")) && optional.isEmpty()) {
                        bArr = Uri.EMPTY;
                    }
                    dziVar.d(str, (Uri) optional.orElse(bArr));
                }
                return dziVar;
            case 7:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                alog alogVar = (alog) optional2.get();
                int size = alogVar.size();
                while (true) {
                    Object obj5 = this.a;
                    if (i < size) {
                        SuggestionData suggestionData = (SuggestionData) alogVar.get(i);
                        if (!ryj.c(suggestionData)) {
                            d.s(!ryj.c(suggestionData));
                            if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
                                vjeVar = (vje) ((vlw) obj5).j.get(((SmartSuggestionItemSuggestionData) suggestionData).s());
                            } else {
                                vjeVar = null;
                            }
                            if (vjeVar != null) {
                                vkeVar = vke.c(vkf.NAT_NON_TEXT_SMART_ACTION, vjeVar.a(), Optional.empty());
                            } else {
                                alwl alwlVar = (alwl) vlw.a.i();
                                alwlVar.X(vjh.e, suggestionData.b());
                                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "getNotificationSmartAction", 811, "IncomingMessageActionCreator.java")).q("Missing smart action provider for type");
                                vkeVar = null;
                            }
                            String b = suggestionData.b();
                            if (vkeVar != null && !TextUtils.isEmpty(b)) {
                                arrayList2.add(b);
                                arrayList.add(vkeVar);
                            }
                        }
                        i++;
                    } else {
                        ((vlw) obj5).g.a(arrayList2);
                        return arrayList;
                    }
                }
                break;
            case 8:
                alwo alwoVar2 = vmf.a;
                if (((ywx) obj).equals(ywx.HIDE_NOTIFICATION)) {
                    Object obj6 = this.a;
                    alwl alwlVar2 = (alwl) vmf.a.g();
                    alwlVar2.X(ydl.o, ((ConversationIdType) obj6).toString());
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "shouldCreateBuilderInfoForWearable", 949, "IncomingMessageBlueprint.java")).q("Not creating notification because notification is not an emergency contact");
                    return false;
                }
                return true;
            case 9:
                ((vrj) this.a).n = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(!r13.booleanValue());
            case 10:
                akfc akfcVar = vru.a;
                return this.a;
            case 11:
                Optional optional3 = (Optional) obj;
                optional3.ifPresentOrElse(new rge(this.a, optional3, 20), new eyg(12));
                return new gsw();
            case 12:
                for (wxb wxbVar : (Set) obj) {
                    Object obj7 = this.a;
                    RcsAvailabilityLogWorker rcsAvailabilityLogWorker = (RcsAvailabilityLogWorker) obj7;
                    rcsAvailabilityLogWorker.c(((vrn) ((xyt) rcsAvailabilityLogWorker.f.b()).a()).w(new adiw(wxbVar.c)), Optional.of(wxbVar));
                }
                return new gsw();
            case 13:
                ((mbl) ((vsu) this.a).c.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                vsu.a.r("JibeServiceException was raised while calling RcsEngineLifecycleService", (ajny) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 14:
                ((mbl) ((vsz) this.a).d.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                vsz.a.r("JibeServiceException was raised while calling RcsEngineLifecycleServiceV2", (ajny) obj);
                return new com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult(1);
            case 15:
                alog alogVar2 = (alog) obj;
                alob alobVar = new alob();
                int size2 = alogVar2.size();
                while (i < size2) {
                    Object obj8 = this.a;
                    ancr c = akto.c(new uvj(obj8, (ConversationIdType) alogVar2.get(i), 9, bArr));
                    vtr vtrVar = (vtr) obj8;
                    alobVar.h(akul.g(vtrVar.e.b(c, vtrVar.c)));
                    i++;
                }
                return alobVar.g();
            case 16:
                return ((vui) this.a).j.a((String) obj, false);
            case 17:
                return this.a.r((ConversationIdType) obj);
            case 18:
                String str2 = (String) obj;
                aozy createBuilder = amkt.a.createBuilder();
                long millis = ((Duration) this.a).toMillis();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amkt amktVar = (amkt) apagVar;
                amktVar.b |= 4;
                amktVar.e = millis;
                str2.getClass();
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amkt amktVar2 = (amkt) apagVar2;
                amktVar2.b |= 1;
                amktVar2.c = str2;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amkt amktVar3 = (amkt) createBuilder.b;
                amktVar3.b |= 8;
                amktVar3.f = true;
                return (amkt) createBuilder.s();
            case 19:
                aozy aozyVar = (aozy) obj;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj9 = this.a;
                amfv amfvVar = (amfv) aozyVar.b;
                amfv amfvVar2 = amfv.a;
                obj9.getClass();
                amfvVar.i = (amkt) obj9;
                amfvVar.b |= 64;
                return zap.q((amfv) aozyVar.s());
            default:
                aozy aozyVar2 = (aozy) obj;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                Object obj10 = this.a;
                amfv amfvVar3 = (amfv) aozyVar2.b;
                amfv amfvVar4 = amfv.a;
                obj10.getClass();
                amfvVar3.j = (amks) obj10;
                amfvVar3.b |= 128;
                return zap.q((amfv) aozyVar2.s());
        }
    }
}
