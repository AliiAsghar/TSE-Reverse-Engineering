package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xvi extends ContentProvider {
    private static final xze a = xze.g("BugleDataModel", "ImageContentProvider");

    protected abstract Bitmap b(Uri uri);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete not supported");
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        return new String[]{"image/png"};
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "image/png";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert not supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (getContext() != null) {
            Bitmap b = b(uri);
            File file = new File(getContext().getCacheDir(), String.valueOf(String.valueOf(UUID.randomUUID())).concat(".png"));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                if (!file.delete()) {
                    xyo b2 = a.b();
                    b2.H(getClass().getSimpleName());
                    b2.H("Failed to delete temp file.");
                    b2.k(uri);
                    b2.q();
                }
                return open;
            }
            xyo b3 = a.b();
            b3.H(getClass().getSimpleName());
            b3.H("Failed to generate image.");
            b3.k(uri);
            b3.q();
            throw new FileNotFoundException();
        }
        xyo b4 = a.b();
        b4.H(getClass().getSimpleName());
        b4.H("Could not create image, context is null.");
        b4.k(uri);
        b4.q();
        throw new FileNotFoundException();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("query not supported");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update not supported");
    }
}
