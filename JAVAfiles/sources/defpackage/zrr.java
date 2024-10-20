package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zrr extends Activity implements apxr {
    private volatile apxb a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxb aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new apxb(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.c) {
            this.c = true;
            LaunchConversationShimActivity launchConversationShimActivity = (LaunchConversationShimActivity) this;
            kqj kqjVar = (kqj) aS();
            launchConversationShimActivity.a = (qoq) kqjVar.b.si.b();
            launchConversationShimActivity.b = kqjVar.b.um;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return aR().b.aS();
    }
}
