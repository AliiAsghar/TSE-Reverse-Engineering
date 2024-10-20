package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Notification.CallStyle forIncomingCall;
        forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
        return forIncomingCall;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        Notification.CallStyle forOngoingCall;
        forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
        return forOngoingCall;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Notification.CallStyle forScreeningCall;
        forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
        return forScreeningCall;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        Notification.CallStyle answerButtonColorHint;
        answerButtonColorHint = callStyle.setAnswerButtonColorHint(i);
        return answerButtonColorHint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
        Notification.CallStyle declineButtonColorHint;
        declineButtonColorHint = callStyle.setDeclineButtonColorHint(i);
        return declineButtonColorHint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
        Notification.CallStyle isVideo;
        isVideo = callStyle.setIsVideo(z);
        return isVideo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        Notification.CallStyle verificationIcon;
        verificationIcon = callStyle.setVerificationIcon(icon);
        return verificationIcon;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        Notification.CallStyle verificationText;
        verificationText = callStyle.setVerificationText(charSequence);
        return verificationText;
    }

    public static File i(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean j(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            d.q(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    d.q(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    d.q(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean k(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean j = j(file, inputStream);
            d.q(inputStream);
            return j;
        } catch (Throwable th2) {
            th = th2;
            d.q(inputStream);
            throw th;
        }
    }

    public static ByteBuffer l(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    MappedByteBuffer map = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final cas m(enh enhVar, bwj bwjVar) {
        return cak.a(enhVar.b(), bwjVar);
    }

    public static final eoz n(View view) {
        view.getClass();
        return (eoz) arrn.f(arrn.j(arrn.e(view, rp.f), rp.g));
    }

    public static final void o(View view, eoz eozVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, eozVar);
    }
}
