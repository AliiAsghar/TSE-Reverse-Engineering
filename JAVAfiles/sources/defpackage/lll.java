package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.StartChatActivity;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lll implements lju {
    public final Context a;
    public final Object b;
    public final Object c;
    private final /* synthetic */ int d;

    public lll(Context context, ajwt ajwtVar, armf armfVar, int i) {
        this.d = i;
        ajwtVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = ajwtVar;
        this.c = armfVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [qoq, java.lang.Object] */
    @Override // defpackage.lju
    public final /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        String r;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (((Boolean) ktf.a.e()).booleanValue()) {
                                kor korVar = (kor) this.b.b();
                                Context context = this.a;
                                ksw kswVar = new ksw(null, null);
                                kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
                                korVar.a(context, kswVar.e());
                            } else {
                                ((ksm) this.c.b()).h(this.a);
                            }
                            return arnb.a;
                        }
                        qjh.l(this.c, null, new leb(this, (arpe) null, 3), 3);
                        return arnb.a;
                    }
                    lmp lmpVar = (lmp) lkfVar;
                    ((Optional) this.c).isPresent();
                    Activity al = aabr.al(this.a);
                    if (al != null) {
                        ?? r3 = this.b;
                        lmq lmqVar = lmpVar.a;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("via_share_intent", true);
                        r3.i(al, bundle);
                        al.finish();
                        return arnb.a;
                    }
                    throw new IllegalArgumentException("HomeNavigationHandler must be created with an activity context.");
                }
                lmo lmoVar = (lmo) lkfVar;
                ksm ksmVar = (ksm) this.c.b();
                Activity al2 = aabr.al(this.a);
                if (al2 != null) {
                    Object F = arro.F(ksmVar.d(al2, lmoVar.a, (ajwt) this.b, lmoVar.b), arpeVar);
                    if (F == arpl.a) {
                        return F;
                    }
                    return arnb.a;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            lle lleVar = (lle) lkfVar;
            yyu yyuVar = (yyu) this.c.b();
            ConversationId conversationId = lleVar.a;
            int i2 = lleVar.d;
            List<Recipient> list = lleVar.b;
            SelfIdentityId selfIdentityId = lleVar.c;
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            for (Recipient recipient : list) {
                msh f = recipient.f();
                f.getClass();
                if (qta.r()) {
                    r = wfh.x(recipient.r(true));
                } else {
                    r = recipient.r(true);
                }
                String str = r;
                str.getClass();
                arrayList.add(new ChipData(f, str, recipient.e().b, recipient.b(), true));
            }
            Context context2 = this.a;
            Object obj = this.b;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            aqjn.aL(arrayList, arrayList2);
            alvg h = yyu.a.h();
            h.X(ydl.q, conversationId);
            h.X(new alvz("state", Integer.class, false, false), Integer.valueOf(i2));
            ((alvg) h.h("com/google/android/apps/messaging/startchat/StartChatEntryPointImpl", "internalLaunchStartChatToAddPeople", 178, "StartChatEntryPointImpl.kt")).q("launch start chat to add people");
            ((ifq) yyuVar.b.b()).g(Boolean.valueOf(!((Boolean) yyv.j.e()).booleanValue()));
            Bundle bundle2 = new Bundle(4);
            bundle2.putInt("selection_mode", yyu.a(i2));
            bundle2.putParcelable("conversation_mapi_id", conversationId);
            bundle2.putParcelableArrayList("identities", arrayList2);
            bundle2.putParcelable("self_identity_id", selfIdentityId);
            bundle2.putInt("contact_picker_source", 2);
            Intent intent = new Intent(context2, (Class<?>) StartChatActivity.class);
            intent.putExtras(bundle2);
            ajya.c(intent, (ajwt) obj);
            akto.n(context2, intent);
            return arnb.a;
        }
        ((yjl) this.b.b()).a(new llk(this, (llj) lkfVar, 0));
        return arnb.a;
    }

    public lll(Context context, armf armfVar, armf armfVar2, int i) {
        this.d = i;
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
    }

    public lll(Context context, ajwt ajwtVar, armf armfVar, int i, byte[] bArr) {
        this.d = i;
        ajwtVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = ajwtVar;
        this.c = armfVar;
    }

    public lll(Context context, qoq qoqVar, Optional optional, int i) {
        this.d = i;
        qoqVar.getClass();
        this.a = context;
        this.b = qoqVar;
        this.c = optional;
    }

    public lll(Context context, arwe arweVar, armf armfVar, int i) {
        this.d = i;
        arweVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.c = arweVar;
        this.b = armfVar;
    }

    public lll(Activity activity, armf armfVar, armf armfVar2, int i) {
        this.d = i;
        armfVar2.getClass();
        this.a = activity;
        this.b = armfVar;
        this.c = armfVar2;
    }
}
