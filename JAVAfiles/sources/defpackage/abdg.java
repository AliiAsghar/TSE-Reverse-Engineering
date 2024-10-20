package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdg {
    private static final alwo a = alwo.o("BugleVideoTrimmer");

    public static Intent a(Uri uri, long j, int i, int i2) {
        int intValue;
        int intValue2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.samsung.app.newtrim/com.samsung.app.newtrim.trimactivity.TrimActivity"));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(131);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("VIDEO_OUTPUT_SIZE", j);
        if (i > ((Integer) abdh.d.e()).intValue() || i2 > ((Integer) abdh.d.e()).intValue()) {
            double intValue3 = ((Integer) abdh.d.e()).intValue() / Math.max(i, i2);
            i2 = (int) (i2 * intValue3);
            i = (int) (i * intValue3);
        }
        if (((Integer) abdh.b.e()).intValue() == -1) {
            intValue = Math.max(i, i2);
        } else {
            intValue = ((Integer) abdh.b.e()).intValue();
        }
        intent.putExtra("VIDEO_OUTPUT_WIDTH", intValue);
        if (((Integer) abdh.c.e()).intValue() == -1) {
            intValue2 = Math.min(i, i2);
        } else {
            intValue2 = ((Integer) abdh.c.e()).intValue();
        }
        intent.putExtra("VIDEO_OUTPUT_HEIGHT", intValue2);
        intent.setDataAndType(uri, "video/*");
        if (((Boolean) abdh.e.e()).booleanValue()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerIntents", "getVideoTrimmerIntent", 71, "VideoTrimmerIntents.java")).K("Intent extras: Width:%s, Height:%s, OutputFileSize:%s, Uri:%s", Integer.valueOf(intValue), Integer.valueOf(intValue2), Long.valueOf(j), uri);
        }
        return intent;
    }
}
