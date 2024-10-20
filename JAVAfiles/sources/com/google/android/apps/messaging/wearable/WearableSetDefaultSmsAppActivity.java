package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.abdl;
import defpackage.alvw;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.alzz;
import defpackage.apwt;
import defpackage.armf;
import defpackage.lzv;
import defpackage.mho;
import defpackage.qoq;
import defpackage.ruy;
import defpackage.ydl;
import defpackage.yjv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearableSetDefaultSmsAppActivity extends abdl {
    private static final alwo s = alwo.o("BugleWearable");
    public apwt n;
    public armf o;
    public armf p;
    public armf q;
    public armf r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            ((mho) this.n.b()).w(false, true);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Optional empty;
        super.onCreate(bundle);
        alwo alwoVar = s;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(ydl.M, "WearableSetDefaultSmsAppActivity");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreate", 56, "WearableSetDefaultSmsAppActivity.java")).q("Processing remote intents");
        Intent intent = getIntent();
        if (!((yjv) this.r.b()).d()) {
            Uri build = new Uri.Builder().scheme("wear").path("/bugle/set_default_sms/").build();
            if ("android.intent.action.VIEW".equals(intent.getAction()) && build.equals(intent.getData())) {
                alvw m = alwoVar.m();
                m.X(ydl.M, "WearableSetDefaultSmsAppActivity");
                ((alwl) m.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 68, "WearableSetDefaultSmsAppActivity.java")).q("Default sms app intent");
                startActivityForResult(((lzv) this.o.b()).l(this), 1);
                return;
            }
        }
        if ("android.intent.action.VIEW".equals(intent.getAction()) && "wear".equals(intent.getScheme()) && intent.getCategories().contains("android.intent.category.BROWSABLE")) {
            Uri data = intent.getData();
            if (data == null) {
                alwl alwlVar2 = (alwl) alwoVar.i();
                alwlVar2.X(ydl.M, "WearableSetDefaultSmsAppActivity");
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 103, "WearableSetDefaultSmsAppActivity.java")).q("Uri cannot be null");
                empty = Optional.empty();
            } else {
                String path = data.getPath();
                if (path != null && path.startsWith("/bugle/rpc/open_conversation/")) {
                    empty = Optional.of(ruy.b((String) alzz.aO(data.getPathSegments())));
                } else {
                    alvw m2 = alwoVar.m();
                    m2.X(ydl.M, "WearableSetDefaultSmsAppActivity");
                    ((alwl) m2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 111, "WearableSetDefaultSmsAppActivity.java")).t("Unsupported intent path: %s", data.getPath());
                    empty = Optional.empty();
                }
            }
        } else {
            alwl alwlVar3 = (alwl) alwoVar.i();
            alwlVar3.X(ydl.M, "WearableSetDefaultSmsAppActivity");
            ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 96, "WearableSetDefaultSmsAppActivity.java")).q("Intent.action is not ACTION_VIEW or Intent.scheme is not WEAR_URI_SCHEME or invalid category");
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            alvw m3 = alwoVar.m();
            m3.X(ydl.M, "WearableSetDefaultSmsAppActivity");
            ((alwl) m3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 77, "WearableSetDefaultSmsAppActivity.java")).q("Open on phone intent.");
            ((qoq) this.p.b()).r((Context) this.q.b(), new BugleConversationId((ConversationIdType) empty.get()));
        }
        finish();
    }
}
