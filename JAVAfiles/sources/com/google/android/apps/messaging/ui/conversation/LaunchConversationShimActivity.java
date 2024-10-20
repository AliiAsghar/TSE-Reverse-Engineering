package com.google.android.apps.messaging.ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.armf;
import defpackage.lpg;
import defpackage.qoq;
import defpackage.qrl;
import defpackage.zrr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LaunchConversationShimActivity extends zrr {
    public qoq a;
    public armf b;

    @Override // defpackage.zrr, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ConversationId j = ((lpg) this.b.b()).j(intent);
        if (j != null) {
            if (qrl.a()) {
                intent.getBooleanExtra("force_conversation_1", false);
            }
            startActivity(this.a.k(this, j, (MessageCoreData) intent.getParcelableExtra("draft_data"), intent.getBooleanExtra("open_keyboard", false), intent.getExtras()));
        }
        finish();
    }
}
