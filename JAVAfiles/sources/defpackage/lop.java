package defpackage;

import android.R;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lop implements lju {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler");
    private final Context b;
    private final Optional c;
    private final ajwt d;

    public lop(Context context, armf armfVar, Optional optional, ajwt ajwtVar) {
        armfVar.getClass();
        ajwtVar.getClass();
        this.b = context;
        this.c = optional;
        this.d = ajwtVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    @Override // defpackage.lju
    public final /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        Object obj;
        String r;
        this.c.isPresent();
        lon lonVar = ((loo) lkfVar).a;
        ComponentCallbacks2 al = aabr.al(this.b);
        if (al != null) {
            if (al instanceof akkh) {
                obj = ((akkh) al).E();
            } else {
                obj = null;
            }
            if (obj != null && (obj instanceof zxv)) {
                zxv zxvVar = (zxv) obj;
                ConversationId conversationId = lonVar.a;
                String str = lonVar.b;
                alog alogVar = lonVar.c;
                ajwt ajwtVar = this.d;
                Bundle bundle = new Bundle(5);
                bundle.putParcelable("conversation_mapi_id", conversationId);
                bundle.putString("group_name", str);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                alur it = alogVar.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Recipient recipient = (Recipient) it.next();
                    msh f = recipient.f();
                    f.getClass();
                    if (qta.r()) {
                        r = wfh.x(recipient.r(true));
                    } else {
                        r = recipient.r(true);
                    }
                    String str2 = r;
                    str2.getClass();
                    arrayList.add(new ChipData(f, str2, recipient.e().b, recipient.b(), true));
                }
                bundle.putParcelableArrayList("identities", arrayList);
                bundle.putInt("contact_picker_source", 2);
                bundle.putInt("selection_mode", zep.b.ordinal());
                yyw a2 = yyw.a(ajwtVar);
                a2.ak(bundle);
                da a3 = zxvVar.a.a();
                cg e = a3.e("ConversationDetailsFragment");
                if (e != null) {
                    bd bdVar = new bd(a3);
                    bdVar.n(e);
                    bdVar.t("ConversationDetailsFragment");
                    bdVar.i();
                    a3.ag();
                    bd bdVar2 = new bd(a3);
                    bdVar2.v(R.id.content, a2, "GroupRenameFragment");
                    bdVar2.b();
                }
            } else {
                alvw h = a.h();
                h.X(alwp.a, "StartChat");
                ((alvg) h.h("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler", "handleGroupRename", 130, "StartChat.kt")).q("Activity to host group name edit was not found");
            }
            return arnb.a;
        }
        throw new IllegalArgumentException("StartChatNavigationHandler must be created with an activity context.");
    }
}
