package defpackage;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxu implements ajyk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zxu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        if (this.b != 0) {
            alvw h = lfj.a.h();
            h.X(alwp.a, "MessageDetails");
            ((alvg) ((alvg) h).g(ajxtVar).h("com/google/android/apps/messaging/messagedetails/MessageDetailsActivityPeer$AccountSelectionCallback", "onNoAccountAvailable", 78, "MessageDetailsActivityPeer.kt")).q("Cannot create MessageDetailsActivity because account is not available");
        }
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        Parcelable parcelableExtra;
        Parcelable parcelableExtra2;
        Object parcelableExtra3;
        Object parcelableExtra4;
        if (this.b != 0) {
            ajwt n = agxwVar.n();
            n.getClass();
            lfj lfjVar = (lfj) this.a;
            Intent intent = lfjVar.b.getIntent();
            intent.getClass();
            if (Build.VERSION.SDK_INT > 33) {
                parcelableExtra4 = intent.getParcelableExtra("mapi_conversation_id", ConversationId.class);
                parcelableExtra = (Parcelable) parcelableExtra4;
            } else {
                parcelableExtra = intent.getParcelableExtra("mapi_conversation_id");
            }
            parcelableExtra.getClass();
            ConversationId conversationId = (ConversationId) parcelableExtra;
            Intent intent2 = lfjVar.b.getIntent();
            intent2.getClass();
            if (Build.VERSION.SDK_INT > 33) {
                parcelableExtra3 = intent2.getParcelableExtra("MESSAGE_ID", MessageId.class);
                parcelableExtra2 = (Parcelable) parcelableExtra3;
            } else {
                parcelableExtra2 = intent2.getParcelableExtra("MESSAGE_ID");
            }
            parcelableExtra2.getClass();
            lfk lfkVar = new lfk();
            apxh.e(lfkVar);
            aklw.b(lfkVar, n);
            Bundle bundle = lfkVar.m;
            bundle.getClass();
            hld.B(bundle, jhq.a);
            bundle.putParcelable("mapi_conversation_id", conversationId);
            bundle.putParcelable("MESSAGE_ID", (MessageId) parcelableExtra2);
            bd bdVar = new bd(lfjVar.b.a());
            bdVar.v(R.id.content, lfkVar, "MessageDetailsFragment");
            bdVar.b();
            return;
        }
        ajwt n2 = agxwVar.n();
        n2.getClass();
        Object obj = this.a;
        ((Optional) ((zxv) obj).b.b()).ifPresent(new zrg(new wup(n2, obj, 15, null), 14));
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}
