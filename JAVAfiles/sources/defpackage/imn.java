package defpackage;

import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imn {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/draft/model/AttachmentSourceToBugleMessageAttachmentSourceKt");

    public static final ameb a(afcp afcpVar) {
        if (afcpVar instanceof afgi) {
            return ameb.DEVICE_CAMERA_APP;
        }
        if (afcpVar instanceof afgh) {
            int i = ((afgh) afcpVar).d - 1;
            if (i != 0) {
                if (i != 1) {
                    return ameb.POPUP_CAMERA;
                }
                return ameb.FULLSCREEN_CAMERA;
            }
            return ameb.MINI_CAMERA;
        }
        if (afcpVar instanceof afgg) {
            afgg afggVar = (afgg) afcpVar;
            if (d.F(afggVar, afge.a)) {
                return ameb.GALLERY_CHOOSER;
            }
            if (d.F(afggVar, afgf.a)) {
                return ameb.GALLERY_LIBRARY;
            }
            throw new armm();
        }
        if (afcpVar instanceof afct) {
            return ameb.FILE_CHOOSER;
        }
        if (afcpVar instanceof afxq) {
            return ameb.EXPRESSIVE_STICKER_CHOOSER;
        }
        if (afcpVar instanceof afqp) {
            return ameb.GIF_CHOOSER;
        }
        if (afcpVar instanceof afcm) {
            int i2 = ((afcm) afcpVar).b - 1;
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return ameb.DRAG_AND_DROP;
                    }
                    return ameb.CLIPBOARD;
                }
                return ameb.UNKNOWN_IME;
            }
            return ameb.SHARE;
        }
        if (afcpVar instanceof VideoTrimmerSource) {
            return ameb.VIDEO_TRIMMER;
        }
        if (afcpVar instanceof afqe) {
            if (((afqe) afcpVar).a()) {
                return ameb.CUSTOM_STICKER_SELF_OWNED;
            }
            return ameb.CUSTOM_STICKER_AUTO_SAVED;
        }
        alvg alvgVar = (alvg) a.h();
        Objects.toString(afcpVar);
        ((alvg) alvgVar.g(new IllegalStateException("Unhandled attachment source ".concat(afcpVar.toString()))).h("com/google/android/apps/messaging/conversation/draft/model/AttachmentSourceToBugleMessageAttachmentSourceKt", "toBugleMessageAttachmentSource", 60, "AttachmentSourceToBugleMessageAttachmentSource.kt")).q("Falling back to NOT_AVAILABLE");
        return ameb.NOT_AVAILABLE;
    }
}
