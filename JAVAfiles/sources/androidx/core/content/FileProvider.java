package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.android.vcard.VCardConfig;
import defpackage.d;
import defpackage.egl;
import defpackage.fvq;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private final Object d = new Object();
    private String e;
    private fvq f;

    public static Uri a(Context context, String str, File file) {
        String substring;
        fvq d = d(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : ((HashMap) d.b).entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (fvq.r(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority((String) d.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
        } catch (IOException unused) {
            Objects.toString(file);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
        }
    }

    public static String b(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    private final fvq c() {
        fvq fvqVar;
        synchronized (this.d) {
            d.aB(this.e, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.f == null) {
                this.f = d(getContext(), this.e);
            }
            fvqVar = this.f;
        }
        return fvqVar;
    }

    private static fvq d(Context context, String str) {
        fvq fvqVar;
        HashMap hashMap = c;
        synchronized (hashMap) {
            fvqVar = (fvq) hashMap.get(str);
            if (fvqVar == null) {
                try {
                    try {
                        fvqVar = new fvq(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (resolveContentProvider != null) {
                            Bundle bundle = resolveContentProvider.metaData;
                            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                            if (loadXmlMetaData == null) {
                                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                            }
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next != 1) {
                                    if (next == 2) {
                                        String name = loadXmlMetaData.getName();
                                        File file = null;
                                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                        if ("root-path".equals(name)) {
                                            file = b;
                                        } else if ("files-path".equals(name)) {
                                            file = context.getFilesDir();
                                        } else if ("cache-path".equals(name)) {
                                            file = context.getCacheDir();
                                        } else if ("external-path".equals(name)) {
                                            file = Environment.getExternalStorageDirectory();
                                        } else if ("external-files-path".equals(name)) {
                                            File[] g = egl.g(context);
                                            if (g.length > 0) {
                                                file = g[0];
                                            }
                                        } else if ("external-cache-path".equals(name)) {
                                            File[] externalCacheDirs = context.getExternalCacheDirs();
                                            if (externalCacheDirs.length > 0) {
                                                file = externalCacheDirs[0];
                                            }
                                        } else if ("external-media-path".equals(name)) {
                                            File[] externalMediaDirs = context.getExternalMediaDirs();
                                            if (externalMediaDirs.length > 0) {
                                                file = externalMediaDirs[0];
                                            }
                                        }
                                        if (file != null) {
                                            String[] strArr = {attributeValue2};
                                            for (char c2 = 0; c2 <= 0; c2 = 1) {
                                                String str2 = strArr[0];
                                                if (str2 != null) {
                                                    file = new File(file, str2);
                                                }
                                            }
                                            if (!TextUtils.isEmpty(attributeValue)) {
                                                try {
                                                    ((HashMap) fvqVar.b).put(attributeValue, file.getCanonicalFile());
                                                } catch (IOException e) {
                                                    Objects.toString(file);
                                                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file.toString()), e);
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Name must not be empty");
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    c.put(str, fvqVar);
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return fvqVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.d) {
                    this.e = str;
                }
                HashMap hashMap = c;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (c().q(uri).delete()) {
            return 1;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File q = c().q(uri);
        int lastIndexOf = q.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(q.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File q = c().q(uri);
        if ("r".equals(str)) {
            i = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(q, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File q = c().q(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                i = i2 + 1;
                strArr3[i2] = "_display_name";
                if (queryParameter == null) {
                    str3 = q.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                i = i2 + 1;
                strArr3[i2] = "_size";
                objArr[i2] = Long.valueOf(q.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
