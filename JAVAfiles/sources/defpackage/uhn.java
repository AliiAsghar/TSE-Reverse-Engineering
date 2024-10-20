package defpackage;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.provider.ProxyProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhn extends ContentProvider {
    private static final Random a = new Random();
    private static final vl b = new vl();
    private static final alhr c = uuh.w("enable_proxy_provider_audio_support");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uff dK();
    }

    public static Uri a(Context context, Uri uri, String str, String str2, long j) {
        Uri.Builder scheme = new Uri.Builder().authority(uho.a(context)).scheme("content");
        String valueOf = String.valueOf(a.nextLong());
        String c2 = gh.c(str2);
        if (!TextUtils.isEmpty(c2)) {
            valueOf = String.format("%s.%s", valueOf, c2);
        }
        scheme.appendPath(valueOf);
        Uri build = scheme.build();
        vl vlVar = b;
        synchronized (vlVar) {
            vlVar.put(build, new asnl(uri, str2, str, j));
        }
        return build;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        asnl asnlVar;
        vl vlVar = b;
        synchronized (vlVar) {
            asnlVar = (asnl) vlVar.get(uri);
        }
        if (asnlVar == null) {
            return null;
        }
        return (String) asnlVar.c;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        asnl asnlVar;
        Object obj;
        InputStream b2;
        vl vlVar = b;
        synchronized (vlVar) {
            asnlVar = (asnl) vlVar.get(uri);
        }
        if (asnlVar == null) {
            obj = null;
        } else {
            obj = asnlVar.d;
        }
        if (obj != null) {
            int a2 = ydh.a(str);
            Uri uri2 = (Uri) obj;
            if (uhl.k(uri2, getContext())) {
                return ParcelFileDescriptor.open(uhl.i(uri2, getContext()), a2);
            }
            if (((Boolean) ((utz) c.get()).e()).booleanValue() && uho.d(uri2)) {
                if (a2 == 268435456) {
                    try {
                        return ParcelFileDescriptor.fromFd((int) ContentUris.parseId((Uri) obj));
                    } catch (IOException e) {
                        throw ((FileNotFoundException) new FileNotFoundException("Unable to create ParcelFileDescriptor from content URI: ".concat(obj.toString())).initCause(e));
                    }
                }
                throw new FileNotFoundException("Read-only mode is required");
            }
            Context context = getContext();
            context.getClass();
            a aVar = (a) akec.w(context, a.class);
            File file = new File(context.getCacheDir(), "proxyscratchspace");
            if ((!file.isDirectory() || !file.exists()) && !file.mkdirs() && !file.exists()) {
                throw new FileNotFoundException(String.format("Failed to make directory for temp file for file %s", uri2.getPath()));
            }
            String replace = String.format("%3s", albo.ag(uri.getLastPathSegment())).replace(' ', '_');
            try {
                File createTempFile = File.createTempFile(replace, null, file);
                aVar.dK().j(createTempFile);
                try {
                    if (getCallingPackage() != null) {
                        getContext().grantUriPermission(getCallingPackage(), (Uri) obj, 3);
                    }
                    Context context2 = getContext();
                    alvi alviVar = ydk.a;
                    if ("com.google.android.ims.rcsfileprovider".equals(((Uri) obj).getAuthority())) {
                        b2 = aipx.b(context2, (Uri) obj, aipw.a("com.google.android.ims"));
                    } else if (ydk.y((Uri) obj)) {
                        b2 = aipx.b(context2, (Uri) obj, aipw.a("com.android.providers.telephony"));
                    } else {
                        b2 = aipx.b(context2, (Uri) obj, aipw.b);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        try {
                            amcp.a(b2, fileOutputStream);
                            ParcelFileDescriptor open = ParcelFileDescriptor.open(createTempFile, a2);
                            if (!createTempFile.delete()) {
                                alvw h = ProxyProvider.a.h();
                                h.X(alwp.a, "Bugle");
                                ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/datamodel/provider/ProxyProvider$ProxyProviderInternal", "openTelephonyFile", 226, "ProxyProvider.java")).t("Failed to delete temp file for %s while returning file descriptor", ((Uri) obj).getPath());
                            }
                            fileOutputStream.close();
                            if (b2 != null) {
                                b2.close();
                            }
                            return open;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException(String.format("Failed to copy to temp file for file %s", uri2.getPath()));
                    fileNotFoundException.initCause(e2);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException(String.format("Failed to create temp file for %s using %s", uri2.getPath(), replace));
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        }
        throw new FileNotFoundException(String.format("Invalid proxy uri : %s", uri.getPath()));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        asnl asnlVar;
        Object obj;
        int length;
        Object obj2;
        vl vlVar = b;
        synchronized (vlVar) {
            asnlVar = (asnl) vlVar.get(uri);
        }
        if (((Boolean) ((utz) c.get()).e()).booleanValue() && asnlVar != null && (obj2 = asnlVar.d) != null && uho.d((Uri) obj2)) {
            throw new UnsupportedOperationException("Query operation not supported for audio");
        }
        Object obj3 = null;
        if (strArr != null && ((length = strArr.length) < 2 || !Arrays.asList(strArr).contains("_display_name") || !Arrays.asList(strArr).contains("_size"))) {
            if (length > 0 && Arrays.asList(strArr).contains("_display_name")) {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name"}, 1);
                MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                if (asnlVar != null) {
                    obj3 = asnlVar.b;
                }
                newRow.add(obj3);
                return matrixCursor;
            }
            if (length <= 0 || !Arrays.asList(strArr).contains("_size")) {
                return null;
            }
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"_size"}, 1);
            MatrixCursor.RowBuilder newRow2 = matrixCursor2.newRow();
            if (asnlVar != null) {
                obj3 = Long.valueOf(asnlVar.a);
            }
            newRow2.add(obj3);
            return matrixCursor2;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{"_display_name", "_size"}, 2);
        MatrixCursor.RowBuilder newRow3 = matrixCursor3.newRow();
        if (asnlVar == null) {
            obj = null;
        } else {
            obj = asnlVar.b;
        }
        newRow3.add(obj);
        if (asnlVar != null) {
            obj3 = Long.valueOf(asnlVar.a);
        }
        newRow3.add(obj3);
        return matrixCursor3;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
