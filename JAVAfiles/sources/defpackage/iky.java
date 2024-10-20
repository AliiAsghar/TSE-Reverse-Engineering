package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iky implements edi {
    public static final alog a = alog.u("image/gif", "image/jpeg", "image/png", "video/mp4");
    private final mci b;
    private final ila c;
    private final rtg d;

    public iky(mci mciVar, ila ilaVar, rtg rtgVar) {
        this.b = mciVar;
        this.c = ilaVar;
        this.d = rtgVar;
    }

    @Override // defpackage.edi
    public final ecv a(View view, ecv ecvVar) {
        ameb amebVar;
        Context context = view.getContext();
        ContentResolver contentResolver = context.getContentResolver();
        Pair e = ecvVar.e(new joc(contentResolver, 1));
        ecv ecvVar2 = (ecv) e.first;
        ecv ecvVar3 = (ecv) e.second;
        if (ecvVar2 != null) {
            ClipData d = ecvVar2.d();
            for (int i = 0; i < d.getItemCount(); i++) {
                Uri uri = d.getItemAt(i).getUri();
                String type = contentResolver.getType(uri);
                int b = ecvVar2.b();
                if (a.contains(type)) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                amebVar = ameb.UNKNOWN;
                            } else {
                                amebVar = ameb.DRAG_AND_DROP;
                            }
                        } else if (lgb.E(context) == 3) {
                            amebVar = ameb.GBOARD_EMOJI;
                        } else {
                            amebVar = ameb.UNKNOWN_IME;
                        }
                    } else {
                        amebVar = ameb.CLIPBOARD;
                    }
                    PendingAttachmentData b2 = this.d.b(type, uri, amebVar);
                    amoq a2 = aauk.a(b2);
                    b2.f = a2;
                    this.b.f(a2, this.c.a(b2));
                }
            }
        }
        return ecvVar3;
    }
}
