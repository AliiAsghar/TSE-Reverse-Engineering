package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaww extends aawy {
    public final MediaViewerActivity a;
    public final armf b;
    public aaxa c;
    public rg d;
    public boolean e = false;
    public boolean f = false;

    public aaww(MediaViewerActivity mediaViewerActivity, armf armfVar) {
        this.a = mediaViewerActivity;
        this.b = armfVar;
    }

    public final Intent a(Uri uri, String str, boolean z, boolean z2, String str2) {
        DirectSendResult.Add add;
        DirectSendResult.Send send;
        Intent putExtra = new Intent("android.intent.action.SEND").setType(str).putExtra("android.intent.extra.STREAM", uri);
        if (!this.e) {
            return putExtra;
        }
        if (z2) {
            if (z) {
                send = new DirectSendResult.Send(new EditedMedia(str, uri), str2);
            } else {
                send = new DirectSendResult.Send(null, str2);
            }
            return putExtra.putExtra("direct_send_result", send);
        }
        if (z) {
            add = new DirectSendResult.Add(new EditedMedia(str, uri), str2);
        } else {
            add = new DirectSendResult.Add(null, str2);
        }
        return putExtra.putExtra("direct_send_result", add);
    }
}
