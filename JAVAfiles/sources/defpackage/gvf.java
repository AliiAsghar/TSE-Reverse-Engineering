package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Property;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.csv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gvf {
    private static Method a;
    public static long q;
    public static Method r;
    public static Method s;
    public static gvf t;

    public gvf() {
    }

    public static gry A(int i) {
        if (i != 0) {
            if (i == 1) {
                return gry.LINEAR;
            }
            throw new IllegalArgumentException(a.cb(i, "Could not convert ", " to BackoffPolicy"));
        }
        return gry.EXPONENTIAL;
    }

    public static gtf B(int i) {
        if (i != 0) {
            if (i == 1) {
                return gtf.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(a.cb(i, "Could not convert ", " to OutOfQuotaPolicy"));
        }
        return gtf.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static gtk C(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return gtk.CANCELLED;
                            }
                            throw new IllegalArgumentException(a.cb(i, "Could not convert ", " to State"));
                        }
                        return gtk.BLOCKED;
                    }
                    return gtk.FAILED;
                }
                return gtk.SUCCEEDED;
            }
            return gtk.RUNNING;
        }
        return gtk.ENQUEUED;
    }

    public static gzu D(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT >= 28 && bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    int[] iArr = new int[readInt];
                    for (int i = 0; i < readInt; i++) {
                        iArr[i] = objectInputStream.readInt();
                    }
                    int readInt2 = objectInputStream.readInt();
                    int[] iArr2 = new int[readInt2];
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        iArr2[i2] = objectInputStream.readInt();
                    }
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        int i4 = iArr2[i3];
                        try {
                            builder.addCapability(i4);
                        } catch (IllegalArgumentException e) {
                            gsy.a();
                            Log.w(gzu.a, "Ignoring adding capability '" + i4 + '\'', e);
                        }
                    }
                    for (int i5 = 0; i5 < readInt; i5++) {
                        builder.addTransportType(iArr[i5]);
                    }
                    NetworkRequest build = builder.build();
                    build.getClass();
                    gzu gzuVar = new gzu(build);
                    armd.i(objectInputStream, null);
                    armd.i(byteArrayInputStream, null);
                    return gzuVar;
                } finally {
                }
            } finally {
            }
        } else {
            return new gzu((Object) null);
        }
    }

    public static Set E(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new gse(parse, readBoolean));
                    }
                    armd.i(objectInputStream, null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            armd.i(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static byte[] F(gzu gzuVar) {
        Object obj;
        int[] aI;
        boolean hasTransport;
        int[] aI2;
        boolean hasCapability;
        if (Build.VERSION.SDK_INT >= 28 && (obj = gzuVar.b) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        aI = ((NetworkRequest) obj).getTransportTypes();
                        aI.getClass();
                    } else {
                        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < 9; i++) {
                            int i2 = iArr[i];
                            hasTransport = ((NetworkRequest) obj).hasTransport(i2);
                            if (hasTransport) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                        aI = aqjn.aI(arrayList);
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        aI2 = ((NetworkRequest) obj).getCapabilities();
                        aI2.getClass();
                    } else {
                        int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < 29; i3++) {
                            int i4 = iArr2[i3];
                            hasCapability = ((NetworkRequest) obj).hasCapability(i4);
                            if (hasCapability) {
                                arrayList2.add(Integer.valueOf(i4));
                            }
                        }
                        aI2 = aqjn.aI(arrayList2);
                    }
                    objectOutputStream.writeInt(aI.length);
                    for (int i5 : aI) {
                        objectOutputStream.writeInt(i5);
                    }
                    objectOutputStream.writeInt(aI2.length);
                    for (int i6 : aI2) {
                        objectOutputStream.writeInt(i6);
                    }
                    armd.i(objectOutputStream, null);
                    armd.i(byteArrayOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } else {
            return new byte[0];
        }
    }

    public static byte[] G(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    gse gseVar = (gse) it.next();
                    objectOutputStream.writeUTF(gseVar.a.toString());
                    objectOutputStream.writeBoolean(gseVar.b);
                }
                armd.i(objectOutputStream, null);
                armd.i(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static int H(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 4;
                        if (i2 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + ((Object) as(i)) + " to int");
                        }
                    }
                }
            }
            return i3;
        }
        return 0;
    }

    public static int I(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(a.cb(i, "Could not convert ", " to NetworkType"));
    }

    public static gyg J(gys gysVar) {
        gysVar.getClass();
        return new gyg(gysVar.c, gysVar.v);
    }

    public static long K(boolean z, int i, gry gryVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        int i3;
        long scalb;
        gryVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 == 0) {
                return j6;
            }
            return arrn.v(j6, 900000 + j2);
        }
        if (z) {
            if (gryVar == gry.LINEAR) {
                scalb = j * i;
            } else {
                scalb = Math.scalb((float) j, i - 1);
            }
            return j2 + arrn.w(scalb, 18000000L);
        }
        if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
                i3 = 0;
            } else {
                j7 = j2 + j5;
                i3 = i2;
            }
            long j8 = j7;
            if (j4 != j5 && i3 == 0) {
                return j8 + (j5 - j4);
            }
            return j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static byte[] L(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                try {
                    int digit = Character.digit((char) bArr[i + 1], 16);
                    i += 2;
                    int digit2 = Character.digit((char) bArr[i], 16);
                    if (digit != -1 && digit2 != -1) {
                        byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                    } else {
                        throw new hje();
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new hje(e);
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long M(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    public static Pair N(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            d.E(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i3 = capacity2 - 22;
                int min = Math.min(i3, 65535);
                for (int i4 = 0; i4 < min; i4++) {
                    i2 = i3 - i4;
                    if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                        break;
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                allocate.position(i2);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i2));
            }
            return null;
        }
        return null;
    }

    public static X509Certificate[][] O(FileChannel fileChannel, his hisVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer bK = bK(hisVar.a);
                int i = 0;
                while (bK.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(bN(bK(bK), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(a.cb(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        bL(hashMap, fileChannel, hisVar.b, hisVar.c, hisVar.d, hisVar.e);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    public static String P(Context context, int i, Object... objArr) {
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(i);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StringBuilder sb = new StringBuilder(string.length());
            new j(string, locale).b(0, null, null, null, objArr, new arhj(sb), null);
            return sb.toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void Q(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void R(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static int S(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float bQ = bQ(((i >> 16) & 255) / 255.0f);
        float bQ2 = bQ(((i >> 8) & 255) / 255.0f);
        float bQ3 = bQ((i & 255) / 255.0f);
        float bQ4 = bQ + ((bQ(((i2 >> 16) & 255) / 255.0f) - bQ) * f);
        float bQ5 = bQ2 + ((bQ(((i2 >> 8) & 255) / 255.0f) - bQ2) * f);
        float bQ6 = bQ3 + (f * (bQ((i2 & 255) / 255.0f) - bQ3));
        float bR = bR(bQ4) * 255.0f;
        float bR2 = bR(bQ5) * 255.0f;
        float bR3 = bR(bQ6) * 255.0f;
        return (Math.round(bR) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(bR2) << 8) | Math.round(bR3);
    }

    public static het T(hhr hhrVar, hbb hbbVar) {
        return new het(aa(hhrVar, hbbVar, hgs.b));
    }

    public static heu U(hhr hhrVar, hbb hbbVar) {
        return V(hhrVar, hbbVar, true);
    }

    public static heu V(hhr hhrVar, hbb hbbVar, boolean z) {
        float f;
        if (z) {
            f = hid.a();
        } else {
            f = 1.0f;
        }
        return new heu(ab(hhrVar, f, hbbVar, hgs.a));
    }

    public static hev W(hhr hhrVar, hbb hbbVar, int i) {
        return new hev(aa(hhrVar, hbbVar, new hgv(i)));
    }

    public static hew X(hhr hhrVar, hbb hbbVar) {
        return new hew(aa(hhrVar, hbbVar, hgs.c));
    }

    public static hey Y(hhr hhrVar, hbb hbbVar) {
        return new hey(hha.a(hhrVar, hbbVar, hid.a(), hgs.e, true));
    }

    public static hfa Z(hhr hhrVar, hbb hbbVar) {
        return new hfa(ab(hhrVar, hid.a(), hbbVar, hhi.a));
    }

    public static boolean aA(Constructor constructor) {
        return Modifier.isPublic(constructor.getModifiers());
    }

    public static boolean aB(Field field) {
        return Modifier.isPublic(field.getModifiers());
    }

    public static boolean aC(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean aD(Method method, artf artfVar) {
        return az(method, armd.d(artfVar));
    }

    public static grw aE() {
        if (Build.VERSION.SDK_INT >= 34) {
            return grx.a;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return grx.b;
        }
        return grx.c;
    }

    public static Point aF(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static hgi aG(gui guiVar, gys gysVar) {
        gysVar.getClass();
        return guiVar.d(J(gysVar));
    }

    public static gru aH() {
        if (Build.VERSION.SDK_INT >= 34) {
            return grv.b;
        }
        return grv.a;
    }

    public static int aI(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static IBinder aJ(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            return attributes.token;
        }
        return null;
    }

    public static gow aK() {
        String group;
        String str;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            gow gowVar = gow.a;
            if (apiVersion != null && !arsd.M(apiVersion)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (!matcher.matches() || (group = matcher.group(1)) == null) {
                    return null;
                }
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 == null) {
                    return null;
                }
                int parseInt2 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                if (group3 == null) {
                    return null;
                }
                int parseInt3 = Integer.parseInt(group3);
                if (matcher.group(4) != null) {
                    str = matcher.group(4);
                } else {
                    str = "";
                }
                str.getClass();
                return new gow(parseInt, parseInt2, parseInt3, str);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static int aL(SidecarDeviceState sidecarDeviceState) {
        int i;
        try {
            try {
                i = sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                invoke.getClass();
                i = ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            i = 0;
        }
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }

    public static List aM(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                if (list == null) {
                    return arnv.a;
                }
                return list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                invoke.getClass();
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return arnv.a;
        }
    }

    public static gqz aN(gra graVar, WindowLayoutInfo windowLayoutInfo) {
        gqs gqsVar;
        gqr gqrVar;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            gqt gqtVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                FoldingFeature foldingFeature2 = foldingFeature;
                int type = foldingFeature2.getType();
                if (type != 1) {
                    if (type == 2) {
                        gqsVar = gqs.b;
                    }
                } else {
                    gqsVar = gqs.a;
                }
                int state = foldingFeature2.getState();
                if (state != 1) {
                    if (state == 2) {
                        gqrVar = gqr.b;
                    }
                } else {
                    gqrVar = gqr.a;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                gon gonVar = new gon(bounds);
                Rect a2 = graVar.a();
                if ((gonVar.a() != 0 || gonVar.b() != 0) && ((gonVar.b() == a2.width() || gonVar.a() == a2.height()) && ((gonVar.b() >= a2.width() || gonVar.a() >= a2.height()) && (gonVar.b() != a2.width() || gonVar.a() != a2.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    bounds2.getClass();
                    gqtVar = new gqt(new gon(bounds2), gqsVar, gqrVar);
                }
            }
            if (gqtVar != null) {
                arrayList.add(gqtVar);
            }
        }
        return new gqz(arrayList);
    }

    public static gqz aO(Context context, WindowLayoutInfo windowLayoutInfo) {
        grd grdVar = new grd(null);
        if (Build.VERSION.SDK_INT >= 30) {
            return aN(aE().b(context, grdVar.b), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT >= 29 && (context instanceof Activity)) {
            gru gruVar = grdVar.b;
            return aN(aE().a((Activity) context, gruVar), windowLayoutInfo);
        }
        throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }

    public static gqm aP(float f) {
        Float valueOf = Float.valueOf(f);
        String str = gqn.a;
        str.getClass();
        Object b = new gou(valueOf, str, 1).a("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new kja(f, 1)).b();
        b.getClass();
        float floatValue = ((Number) b).floatValue();
        return new gqm("ratio:" + floatValue, floatValue);
    }

    public static ActivityEmbeddingComponent aQ() {
        Object newProxyInstance = Proxy.newProxyInstance(gpx.class.getClassLoader(), new Class[]{ry$$ExternalSyntheticApiModelOutline0.m$24()}, new InvocationHandler() { // from class: gpw
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return arnb.a;
            }
        });
        newProxyInstance.getClass();
        return ry$$ExternalSyntheticApiModelOutline0.m(newProxyInstance);
    }

    public static boolean aR() {
        WindowExtensions windowExtensions;
        try {
            ClassLoader classLoader = gpx.class.getClassLoader();
            if (classLoader == null) {
                return false;
            }
            goq goqVar = new goq(classLoader);
            windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            windowExtensions.getClass();
            if (new gpx(classLoader, goqVar, windowExtensions).c() == null) {
                return false;
            }
            return true;
        } catch (NoClassDefFoundError unused) {
            Log.d("EmbeddingCompat", "Embedding extension version not found");
            return false;
        } catch (UnsupportedOperationException unused2) {
            Log.d("EmbeddingCompat", "Stub Extension");
            return false;
        }
    }

    public static gon aS(gon gonVar, int i, int i2) {
        int i3 = gonVar.e;
        int i4 = gonVar.d;
        return new gon(gonVar.b + i, gonVar.c + i2, i4 + i, i3 + i2);
    }

    public static gpm aT(gpk gpkVar, gpl gplVar, gpl gplVar2, gpl gplVar3) {
        return new gpm(gpkVar, gplVar, gplVar2, gplVar3);
    }

    public static goy aU(ActivityStack activityStack) {
        List activities;
        boolean isEmpty;
        activities = activityStack.getActivities();
        activities.getClass();
        isEmpty = activityStack.isEmpty();
        return new goy(activities, isEmpty, null);
    }

    public static void aV(int i) {
        if ((i >>> 24) == 255) {
        } else {
            throw new IllegalArgumentException("Divider color must be opaque. Got: ".concat(String.valueOf(Integer.toHexString(i))));
        }
    }

    public static void aW(int i) {
        if (i != -1 && i < 0) {
            throw new IllegalArgumentException(a.bV(i, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
        }
    }

    public static gps aX(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        bundle2.getClass();
        String string = bundle2.getString("androidx.window.embedding.EmbeddingBounds.dimension_type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1939100487:
                    if (string.equals("expanded")) {
                        return gps.b;
                    }
                    break;
                case 99283243:
                    if (string.equals("hinge")) {
                        return gps.c;
                    }
                    break;
                case 106680966:
                    if (string.equals("pixel")) {
                        gps gpsVar = gps.b;
                        return new gpq(bundle2.getInt("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
                case 108285963:
                    if (string.equals("ratio")) {
                        gps gpsVar2 = gps.b;
                        return new gpr(bundle2.getFloat("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Illegal type ".concat(String.valueOf(string)));
    }

    public static void aY(glj gljVar, glm glmVar) {
        gljVar.b(glmVar);
    }

    public static void aZ(glj gljVar, glm glmVar) {
        gljVar.e(glmVar);
    }

    public static List aa(hhr hhrVar, hbb hbbVar, hho hhoVar) {
        return hha.a(hhrVar, hbbVar, 1.0f, hhoVar, false);
    }

    public static List ab(hhr hhrVar, float f, hbb hbbVar, hho hhoVar) {
        return hha.a(hhrVar, hbbVar, f, hhoVar, false);
    }

    public static Paint.Join ac(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }

    public static Paint.Cap ad(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public static hdw ae(byn bynVar) {
        return (hdw) bynVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object af(android.content.Context r13, defpackage.hed r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvf.af(android.content.Context, hed, java.lang.String, java.lang.String, java.lang.String, java.lang.String, arpe):java.lang.Object");
    }

    public static String ag(String str) {
        if (str == null || arsd.M(str)) {
            return null;
        }
        if (str.length() <= 0 || !arro.k(str.charAt(arsd.B(str)), '/')) {
            return str.concat("/");
        }
        return str;
    }

    public static hdw ah(hed hedVar, bwj bwjVar) {
        bwjVar.y(-1248473602);
        bwjVar.y(100458137);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new hei(null, 0);
            bwkVar.ad(T);
        }
        arqw arqwVar = (arqw) T;
        bwkVar.Y();
        Context context = (Context) bwjVar.g(AndroidCompositionLocals_androidKt.b);
        bwjVar.y(100461544);
        boolean G = bwjVar.G(hedVar);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            byu byuVar = new byu(new hdw(), cav.a);
            bwkVar.ad(byuVar);
            T2 = byuVar;
        }
        byn bynVar = (byn) T2;
        bwkVar.Y();
        bwjVar.y(100470879);
        boolean G2 = bwjVar.G(hedVar) | bwjVar.G("__LottieInternalDefaultCacheKey__");
        Object T3 = bwkVar.T();
        if (G2 || T3 == bwj.a.a) {
            T3 = bS(context, hedVar, "__LottieInternalDefaultCacheKey__", true);
            bwkVar.ad(T3);
        }
        bwkVar.Y();
        bxl.f(hedVar, "__LottieInternalDefaultCacheKey__", new hej(arqwVar, context, hedVar, bynVar, null), bwjVar);
        hdw ae = ae(bynVar);
        bwkVar.Y();
        return ae;
    }

    public static hdr ai(hbb hbbVar, boolean z, boolean z2, hdv hdvVar, float f, int i, bwj bwjVar, int i2) {
        int i3;
        float f2;
        boolean z3;
        boolean z4;
        hdv hdvVar2;
        bwjVar.y(683659508);
        if ((i2 & 64) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i3 > 0) {
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                if ((i2 & 2) != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z5 = (!z3) | z;
                bwjVar.y(2024497114);
                bwjVar.y(-1736573089);
                bwk bwkVar = (bwk) bwjVar;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new hdr();
                    bwkVar.ad(T);
                }
                hdr hdrVar = (hdr) T;
                bwkVar.Y();
                bwkVar.Y();
                bwjVar.y(-1303844859);
                Object T2 = bwkVar.T();
                if (T2 == bwj.a.a) {
                    byu byuVar = new byu(Boolean.valueOf(z5), cav.a);
                    bwkVar.ad(byuVar);
                    T2 = byuVar;
                }
                int i4 = i2 & 16;
                if ((i2 & 4) != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z6 = !z4;
                if (i4 != 0) {
                    hdvVar2 = null;
                } else {
                    hdvVar2 = hdvVar;
                }
                bwkVar.Y();
                bwjVar.y(-1303840640);
                float b = f2 / hid.b((Context) bwjVar.g(AndroidCompositionLocals_androidKt.b));
                bwkVar.Y();
                Object[] objArr = {hbbVar, Boolean.valueOf(z5), hdvVar2, Float.valueOf(b), Integer.valueOf(i3)};
                hdo hdoVar = new hdo(z5, z6 | z2, hdrVar, hbbVar, i3, b, hdvVar2, (byn) T2, null);
                arpi i5 = bwjVar.i();
                boolean z7 = false;
                for (Object obj : Arrays.copyOf(objArr, 5)) {
                    z7 |= bwjVar.G(obj);
                }
                Object T3 = bwkVar.T();
                if (z7 || T3 == bwj.a.a) {
                    bwkVar.ad(new bxz(i5, hdoVar));
                }
                bwkVar.Y();
                return hdrVar;
            }
            throw new IllegalArgumentException("Speed must be a finite number. It is " + f2 + ".");
        }
        throw new IllegalArgumentException("Iterations must be a positive number (0).");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static ListenableFuture aj(WorkDatabase workDatabase, gpx gpxVar, arqr arqrVar) {
        ?? r3 = gpxVar.b;
        r3.getClass();
        return at(r3, "loadStatusFuture", new qjz(arqrVar, workDatabase, 1));
    }

    public static rae ak(byn bynVar) {
        return (rae) bynVar.a();
    }

    public static void al(hbb hbbVar, arqg arqgVar, cga cgaVar, int i, rae raeVar, cfq cfqVar, csv csvVar, boolean z, bwj bwjVar, int i2, int i3, int i4) {
        cga cgaVar2;
        int i5;
        rae raeVar2;
        cfq cfqVar2;
        csv csvVar2;
        boolean z2;
        arqgVar.getClass();
        int i6 = i4 & 4;
        bwj c = bwjVar.c(1413992462);
        if (i6 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        if ((i4 & 64) != 0) {
            i5 = 1;
        } else {
            i5 = i;
        }
        if ((i4 & 256) != 0) {
            raeVar2 = null;
        } else {
            raeVar2 = raeVar;
        }
        if ((i4 & 512) != 0) {
            cfqVar2 = cfq.a.e;
        } else {
            cfqVar2 = cfqVar;
        }
        if ((i4 & 1024) != 0) {
            csvVar2 = csv.a.b;
        } else {
            csvVar2 = csvVar;
        }
        if ((i4 & 2048) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = (!z2) | z;
        c.y(1444728492);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new hbl();
            bwkVar.ad(T);
        }
        hbl hblVar = (hbl) T;
        bwkVar.Y();
        c.y(1444729988);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = new Matrix();
            bwkVar.ad(T2);
        }
        Matrix matrix = (Matrix) T2;
        bwkVar.Y();
        c.y(1444732573);
        boolean G = c.G(hbbVar);
        Object T3 = bwkVar.T();
        if (G || T3 == bwj.a.a) {
            T3 = new byu(null, cav.a);
            bwkVar.ad(T3);
        }
        byn bynVar = (byn) T3;
        bwkVar.Y();
        c.y(1444734266);
        if (hbbVar != null && hbbVar.a() != brg.a) {
            bwkVar.Y();
            float a2 = hid.a();
            int i7 = i5;
            adt.a(amv.j(cgaVar2, hbbVar.h.width() / a2, hbbVar.h.height() / a2), new hds(hbbVar, csvVar2, cfqVar2, matrix, hblVar, i5, raeVar2, z3, arqgVar, bynVar), c, 0);
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new hdt(hbbVar, arqgVar, cgaVar2, i7, raeVar2, cfqVar2, csvVar2, z3, i2, i3, i4, 0);
                return;
            }
            return;
        }
        int i8 = i5;
        akc.b(cgaVar2, c, (i2 >> 6) & 14);
        bwkVar.Y();
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new hdt(hbbVar, arqgVar, cgaVar2, i8, raeVar2, cfqVar2, csvVar2, z3, i2, i3, i4, 1);
        }
    }

    public static void am(hbb hbbVar, cga cgaVar, boolean z, boolean z2, hdv hdvVar, float f, int i, int i2, rae raeVar, bwj bwjVar, int i3, int i4, int i5) {
        cga cgaVar2;
        boolean z3;
        boolean z4;
        hdv hdvVar2;
        float f2;
        int i6;
        rae raeVar2;
        int i7 = i5 & 2;
        bwj c = bwjVar.c(626429631);
        if (i7 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        int i8 = 0;
        if ((i5 & 4) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = (!z3) | z;
        if ((i5 & 8) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z6 = (!z4) | z2;
        if ((i5 & 16) != 0) {
            hdvVar2 = null;
        } else {
            hdvVar2 = hdvVar;
        }
        if ((i5 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i5 & 64) != 0) {
            i6 = 1;
        } else {
            i6 = i;
        }
        if ((i5 & 1024) == 0) {
            i8 = 1;
        }
        int i9 = (i8 ^ 1) | i2;
        if ((i5 & 8192) != 0) {
            raeVar2 = null;
        } else {
            raeVar2 = raeVar;
        }
        int i10 = cfq.a;
        cfq cfqVar = cfq.a.e;
        int i11 = csv.a;
        csv csvVar = csv.a.b;
        hdr ai = ai(hbbVar, z5, z6, hdvVar2, f2, i6, c, 896);
        c.y(1444870683);
        boolean G = c.G(ai);
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new gqu(ai, 11);
            bwkVar.ad(T);
        }
        arqg arqgVar = (arqg) T;
        bwkVar.Y();
        int i12 = i3 >> 12;
        int i13 = i4 << 15;
        int i14 = i4 >> 15;
        al(hbbVar, arqgVar, cgaVar2, i9, raeVar2, cfqVar, csvVar, true, c, ((i3 << 3) & 896) | 134217736 | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (3670016 & (i4 << 18)) | (29360128 & i13) | (1879048192 & i13), (i14 & 14) | 512 | (i14 & 112), 0);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new hdu(hbbVar, cgaVar2, z5, z6, hdvVar2, f2, i6, i9, raeVar2, i3, i4, i5);
        }
    }

    public static void an(ico icoVar, hgi hgiVar) {
        hgiVar.getClass();
        icoVar.I(hgiVar, -512);
    }

    public static gui ao(boolean z) {
        guj gujVar = new guj();
        if (z) {
            return new guk(gujVar);
        }
        return gujVar;
    }

    public static gui ap() {
        return ao(true);
    }

    public static ListenableFuture aq(Executor executor, arqg arqgVar) {
        return d.m(new mfg(executor, arqgVar, 1));
    }

    public static gtm ar(Context context) {
        context.getClass();
        return gvd.m(context);
    }

    public static /* synthetic */ String as(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "TEMPORARILY_UNMETERED";
                        }
                        return "METERED";
                    }
                    return "NOT_ROAMING";
                }
                return "UNMETERED";
            }
            return "CONNECTED";
        }
        return "NOT_REQUIRED";
    }

    public static ListenableFuture at(Executor executor, String str, arqg arqgVar) {
        executor.getClass();
        return d.m(new gst(executor, str, arqgVar, 1, (byte[]) null));
    }

    public static /* synthetic */ ListenableFuture au(arpi arpiVar, arqv arqvVar) {
        arwf arwfVar = arwf.a;
        arpiVar.getClass();
        arwfVar.getClass();
        return d.m(new gst(arpiVar, arwfVar, arqvVar, 0));
    }

    public static byte[] av(gsi gsiVar) {
        int i;
        String str;
        Double d;
        double d2;
        Float f;
        float f2;
        Long l;
        long j;
        Integer num;
        int i2;
        Byte b;
        byte b2;
        Boolean bool;
        boolean z;
        gsiVar.getClass();
        int i3 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i4 = 1;
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(gsiVar.b.size());
                for (Map.Entry entry : gsiVar.b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i3);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i4);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else if (value instanceof Object[]) {
                        Object[] objArr = (Object[]) value;
                        Class<?> cls = objArr.getClass();
                        int i5 = arsc.a;
                        arrh arrhVar = new arrh(cls);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (d.F(arrhVar, new arrh(Boolean[].class))) {
                            i = 8;
                        } else if (d.F(arrhVar, new arrh(Byte[].class))) {
                            i = 9;
                        } else if (d.F(arrhVar, new arrh(Integer[].class))) {
                            i = 10;
                        } else if (d.F(arrhVar, new arrh(Long[].class))) {
                            i = 11;
                        } else if (d.F(arrhVar, new arrh(Float[].class))) {
                            i = 12;
                        } else if (d.F(arrhVar, new arrh(Double[].class))) {
                            i = 13;
                        } else if (d.F(arrhVar, new arrh(String[].class))) {
                            i = 14;
                        } else {
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new arrh(objArr.getClass()).b())));
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                if (obj instanceof Boolean) {
                                    bool = (Boolean) obj;
                                } else {
                                    bool = null;
                                }
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                dataOutputStream.writeBoolean(z);
                            } else if (i == 9) {
                                if (obj instanceof Byte) {
                                    b = (Byte) obj;
                                } else {
                                    b = null;
                                }
                                if (b != null) {
                                    b2 = b.byteValue();
                                } else {
                                    b2 = 0;
                                }
                                dataOutputStream.writeByte(b2);
                            } else if (i == i7) {
                                if (obj instanceof Integer) {
                                    num = (Integer) obj;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                dataOutputStream.writeInt(i2);
                            } else if (i == i6) {
                                if (obj instanceof Long) {
                                    l = (Long) obj;
                                } else {
                                    l = null;
                                }
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = 0;
                                }
                                dataOutputStream.writeLong(j);
                            } else if (i == 12) {
                                if (obj instanceof Float) {
                                    f = (Float) obj;
                                } else {
                                    f = null;
                                }
                                if (f != null) {
                                    f2 = f.floatValue();
                                } else {
                                    f2 = brg.a;
                                }
                                dataOutputStream.writeFloat(f2);
                            } else if (i == 13) {
                                if (obj instanceof Double) {
                                    d = (Double) obj;
                                } else {
                                    d = null;
                                }
                                if (d != null) {
                                    d2 = d.doubleValue();
                                } else {
                                    d2 = 0.0d;
                                }
                                dataOutputStream.writeDouble(d2);
                            } else {
                                if (obj instanceof String) {
                                    str = (String) obj;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    } else {
                        Class<?> cls2 = value.getClass();
                        int i10 = arsc.a;
                        throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new arrh(cls2).c())));
                    }
                    dataOutputStream.writeUTF(str2);
                    i3 = 0;
                    i4 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() <= 10240) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    armd.i(dataOutputStream, null);
                    byteArray.getClass();
                    return byteArray;
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } finally {
            }
        } catch (IOException e) {
            String str3 = gsj.a;
            gsy.a();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static Executor aw(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new gsc(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static boolean ax(String str, arqg arqgVar) {
        try {
            boolean booleanValue = ((Boolean) arqgVar.a()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean ay(arqg arqgVar) {
        try {
            arqgVar.a();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean az(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static Object bA(gid gidVar, arpe arpeVar) {
        if (gidVar.p()) {
            if (((gim) arpeVar.u().get(gim.a)) == null) {
                return gidVar.h();
            }
            throw null;
        }
        return ((asep) gidVar.i()).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bB(defpackage.gid r7, boolean r8, defpackage.arqr r9, defpackage.arpe r10) {
        /*
            boolean r0 = r10 instanceof defpackage.gjo
            if (r0 == 0) goto L13
            r0 = r10
            gjo r0 = (defpackage.gjo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gjo r0 = new gjo
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L3f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            boolean r7 = r0.b
            boolean r8 = r0.a
            rh r9 = r0.f
            androidx.work.impl.WorkDatabase_Impl r7 = r0.e
            defpackage.aqil.P(r10)
            goto L7e
        L3f:
            defpackage.aqil.P(r10)
            goto L92
        L43:
            defpackage.aqil.P(r10)
            boolean r10 = r7.p()
            if (r10 == 0) goto L66
            boolean r10 = r7.r()
            if (r10 == 0) goto L66
            boolean r10 = r7.q()
            if (r10 == 0) goto L66
            gjp r10 = new gjp
            r10.<init>(r8, r7, r6, r9)
            r0.d = r5
            java.lang.Object r10 = r7.t(r10, r0)
            if (r10 != r1) goto L92
            goto L91
        L66:
            r10 = r7
            androidx.work.impl.WorkDatabase_Impl r10 = (androidx.work.impl.WorkDatabase_Impl) r10
            r0.e = r10
            r10 = r9
            rh r10 = (defpackage.rh) r10
            r0.f = r10
            r0.a = r8
            r10 = 0
            r0.b = r10
            r0.d = r4
            java.lang.Object r10 = bA(r7, r0)
            if (r10 != r1) goto L7e
            goto L91
        L7e:
            arpi r10 = (defpackage.arpi) r10
            gjn r2 = new gjn
            r2.<init>(r6, r7, r8, r9)
            r0.e = r6
            r0.f = r6
            r0.d = r3
            java.lang.Object r10 = defpackage.arro.q(r10, r2, r0)
            if (r10 != r1) goto L92
        L91:
            r10 = r1
        L92:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvf.bB(gid, boolean, arqr, arpe):java.lang.Object");
    }

    public static Cursor bC(gid gidVar, gki gkiVar, boolean z) {
        int i;
        gkiVar.getClass();
        gidVar.j();
        gidVar.k();
        Cursor a2 = gidVar.d().b().a(gkiVar);
        if (z && (a2 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) a2;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (i < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(a2.getColumnNames(), a2.getCount());
                    while (a2.moveToNext()) {
                        Object[] objArr = new Object[a2.getColumnCount()];
                        int columnCount = a2.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = a2.getType(i2);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i2] = a2.getBlob(i2);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i2] = a2.getString(i2);
                                        }
                                    } else {
                                        objArr[i2] = Double.valueOf(a2.getDouble(i2));
                                    }
                                } else {
                                    objArr[i2] = Long.valueOf(a2.getLong(i2));
                                }
                            } else {
                                objArr[i2] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    armd.i(a2, null);
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(a2, th);
                        throw th2;
                    }
                }
            }
            return a2;
        }
        return a2;
    }

    public static int bD(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static int bE(Cursor cursor, String str) {
        String str2;
        int bD = bD(cursor, str);
        if (bD >= 0) {
            return bD;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            str2 = aqil.I(columnNames, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(a.cg(str2, str, "column '", "' does not exist. Available columns: "));
    }

    public static String bF(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static Object bG(gia giaVar, String str, arpe arpeVar) {
        Object a2 = giaVar.a(str, rp.m, arpeVar);
        if (a2 == arpl.a) {
            return a2;
        }
        return arnb.a;
    }

    public static ico bH(gjz gjzVar) {
        return new ico(new gka(gjzVar, new rd(gjzVar, 18)));
    }

    public static gtd bI(gvf gvfVar, String str, Executor executor, arqg arqgVar) {
        executor.getClass();
        return new gte(d.m(new xpo(executor, str, arqgVar, new eny(gtd.b), 1)));
    }

    private static String bJ(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(a.bV(i, "Unknown content digest algorthm: "));
        }
        return "SHA-256";
    }

    private static ByteBuffer bK(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return d.D(byteBuffer, i);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static void bL(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            hir hirVar = new hir(fileChannel, 0L, j);
            hir hirVar2 = new hir(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            d.E(duplicate);
            int position = duplicate.position() + 16;
            if (j >= 0 && j <= 4294967295L) {
                duplicate.putInt(duplicate.position() + position, (int) j);
                hip hipVar = new hip(duplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i = 0;
                while (it.hasNext()) {
                    iArr[i] = ((Integer) it.next()).intValue();
                    i++;
                }
                try {
                    byte[][] bO = bO(iArr, new hiq[]{hirVar, hirVar2, hipVar});
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = iArr[i2];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bO[i2])) {
                            throw new SecurityException(bJ(i3).concat(" digest of contents did not verify"));
                        }
                    }
                    return;
                } catch (DigestException e) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e);
                }
            }
            throw new IllegalArgumentException(a.ck(j, "uint32 value of out range: "));
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] bM(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = j(r6);
        r12 = j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] bN(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvf.bN(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] bO(int[] iArr, hiq[] hiqVarArr) {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (hiqVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) j3;
                byte[] bArr2 = new byte[(i(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                bP(i4, bArr2);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String bJ = bJ(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(bJ);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(bJ.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                hiq hiqVar = hiqVarArr[i6];
                int i9 = i7;
                long j4 = j2;
                int i10 = i6;
                long a2 = hiqVar.a();
                while (a2 > j2) {
                    int min = (int) Math.min(a2, j);
                    bP(min, bArr3);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    try {
                        hiqVar.b(messageDigestArr, j4, min);
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            byte[] bArr4 = bArr[i12];
                            int i14 = i(i13);
                            hiq hiqVar2 = hiqVar;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            byte[] bArr5 = bArr3;
                            int digest = messageDigest.digest(bArr4, (i9 * i14) + 5, i14);
                            if (digest == i14) {
                                i12++;
                                hiqVar = hiqVar2;
                                bArr3 = bArr5;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        hiq hiqVar3 = hiqVar;
                        long j5 = min;
                        j4 += j5;
                        a2 -= j5;
                        i9++;
                        hiqVar = hiqVar3;
                        j2 = 0;
                        j = 1048576;
                    } catch (IOException e2) {
                        throw new DigestException(a.bU(i8, i9, "Failed to digest chunk #", " of section #"), e2);
                    }
                }
                i7 = i9;
                i8++;
                i6 = i10 + 1;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int i16 = iArr[i15];
                byte[] bArr7 = bArr[i15];
                String bJ2 = bJ(i16);
                try {
                    bArr6[i15] = MessageDigest.getInstance(bJ2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(bJ2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        throw new DigestException(a.ck(j3, "Too many chunks: "));
    }

    private static void bP(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static float bQ(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float bR(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static hbt bS(Context context, hed hedVar, String str, boolean z) {
        if (hedVar instanceof heb) {
            if (d.F(str, "__LottieInternalDefaultCacheKey__")) {
                int i = ((heb) hedVar).a;
                return hbf.h(context, R.raw.typing_dots);
            }
            int i2 = ((heb) hedVar).a;
            return hbf.i(context, R.raw.typing_dots, str);
        }
        if (hedVar instanceof hec) {
            if (d.F(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (hedVar instanceof hdz) {
            if (z) {
                return null;
            }
            throw null;
        }
        if (hedVar instanceof hdx) {
            if (d.F(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (hedVar instanceof hea) {
            if (d.F(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((hea) hedVar).a.hashCode());
            }
            return hbf.f(str, new haw(((hea) hedVar).a, str, 2));
        }
        if (hedVar instanceof hdy) {
            context.getContentResolver();
            throw null;
        }
        throw new armm();
    }

    public static void ba(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.transition_current_scene, null);
    }

    public static Path bb(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static ObjectAnimator bc(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }

    public static void bd(String str) {
        str.getClass();
        Trace.beginSection(bg(str));
    }

    public static boolean be() {
        boolean isEnabled;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
        try {
            if (a == null) {
                q = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                a = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = a;
            if (method != null) {
                Object invoke = method.invoke(null, Long.valueOf(q));
                invoke.getClass();
                return ((Boolean) invoke).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            bf("isTagEnabled", e);
            return false;
        }
    }

    public static void bf(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", a.bW(str, "Unable to call ", " via reflection"), exc);
    }

    public static String bg(String str) {
        String str2;
        if (str.length() <= 127) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            String substring = str.substring(0, 127);
            substring.getClass();
            return substring;
        }
        return str2;
    }

    public static Method bh() {
        return (Method) gkj.c.a();
    }

    public static Method bi() {
        return (Method) gkj.b.a();
    }

    public static void bj(gkh gkhVar, Object[] objArr) {
        long j;
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    gkhVar.f(i);
                } else if (obj instanceof byte[]) {
                    gkhVar.c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    gkhVar.d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    gkhVar.d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    gkhVar.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    gkhVar.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    gkhVar.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    gkhVar.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    gkhVar.g(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    gkhVar.e(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static void bk(int i, String str) {
        throw new SQLException(a.bV(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static gjz bl(View view) {
        view.getClass();
        return (gjz) arrn.f(arrn.j(arrn.e(view, rp.o), rp.p));
    }

    public static void bm(View view, gjz gjzVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, gjzVar);
    }

    public static rjn bn(Context context, String str, gke gkeVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new rjn(context, str, gkeVar, z, z2);
    }

    public static void bo(ghw ghwVar, String str) {
        gjj e = ghwVar.e(str);
        try {
            e.h();
        } finally {
            e.e();
        }
    }

    public static gkj bp(mka mkaVar, SQLiteDatabase sQLiteDatabase) {
        mkaVar.getClass();
        Object obj = mkaVar.a;
        if (obj != null) {
            gkj gkjVar = (gkj) obj;
            if (d.F(gkjVar.d, sQLiteDatabase)) {
                return gkjVar;
            }
        }
        gkj gkjVar2 = new gkj(sQLiteDatabase);
        mkaVar.a = gkjVar2;
        return gkjVar2;
    }

    public static String bq(Collection collection) {
        String l;
        if (!collection.isEmpty()) {
            l = arrn.l(arrn.i(arsd.L(aqjn.aK(collection, ",\n", "\n", "\n", null, 56)), new arnd(4, (byte[]) null)), "\n");
            return l.concat("},");
        }
        return " }";
    }

    public static void br(Collection collection) {
        arrn.l(arrn.i(arsd.L(aqjn.aK(collection, ",", null, null, null, 62)), new arnd(4, (byte[]) null)), "\n");
        arrn.l(arrn.i(arsd.L(" }"), new arnd(4, (byte[]) null)), "\n");
    }

    public static void bs(Collection collection) {
        arrn.l(arrn.i(arsd.L(aqjn.aK(collection, ",", null, null, null, 62)), new arnd(4, (byte[]) null)), "\n");
        arrn.l(arrn.i(arsd.L("},"), new arnd(4, (byte[]) null)), "\n");
    }

    public static boolean bt(String str, String str2) {
        if (d.F(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i3 = 0;
                        charAt = '(';
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    substring.getClass();
                    return d.F(arsd.D(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean bu(gju gjuVar, Object obj) {
        Set set;
        if (gjuVar == obj) {
            return true;
        }
        if (!(obj instanceof gju)) {
            return false;
        }
        gju gjuVar2 = (gju) obj;
        if (!d.F(gjuVar.a, gjuVar2.a) || !d.F(gjuVar.b, gjuVar2.b) || !d.F(gjuVar.c, gjuVar2.c)) {
            return false;
        }
        Set set2 = gjuVar.d;
        if (set2 == null || (set = gjuVar2.d) == null) {
            return true;
        }
        return d.F(set2, set);
    }

    public static void bv(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static int bw(gkb gkbVar, String str) {
        int bx = bx(gkbVar, str);
        if (bx >= 0) {
            return bx;
        }
        int bx2 = bx(gkbVar, "`" + str + '`');
        if (bx2 >= 0) {
            return bx2;
        }
        return -1;
    }

    public static int bx(gkb gkbVar, String str) {
        int a2 = gkbVar.a();
        for (int i = 0; i < a2; i++) {
            if (d.F(str, gkbVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void by(HashMap hashMap, arqr arqrVar) {
        int i;
        hashMap.getClass();
        HashMap hashMap2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object obj : hashMap.keySet()) {
                obj.getClass();
                hashMap2.put(obj, hashMap.get(obj));
                i++;
                if (i == 999) {
                    break;
                }
            }
            arqrVar.a(hashMap2);
            hashMap2.clear();
        }
        if (i > 0) {
            arqrVar.a(hashMap2);
        }
    }

    public static Object bz(Class cls) {
        String str;
        String str2;
        Package r0 = cls.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (str == null) {
            str = "";
        }
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
            canonicalName.getClass();
        }
        String concat = arsd.Y(canonicalName, '.', '_').concat("_Impl");
        try {
            if (str.length() == 0) {
                str2 = concat;
            } else {
                str2 = str + '.' + concat;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    private static int i(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(a.bV(i, "Unknown content digest algorthm: "));
        }
        return 32;
    }

    private static int j(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static File l(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static gya m(gyg gygVar, int i) {
        return new gya(gygVar.a, gygVar.b, i);
    }

    public static gya n(gyb gybVar, gyg gygVar) {
        gya gyaVar;
        gih a2 = gih.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        a2.g(1, gygVar.a);
        a2.e(2, gygVar.b);
        gyf gyfVar = (gyf) gybVar;
        gyfVar.a.k();
        Cursor bC = bC(gyfVar.a, a2, false);
        try {
            int bE = bE(bC, "work_spec_id");
            int bE2 = bE(bC, "generation");
            int bE3 = bE(bC, "system_id");
            if (bC.moveToFirst()) {
                gyaVar = new gya(bC.getString(bE), bC.getInt(bE2), bC.getInt(bE3));
            } else {
                gyaVar = null;
            }
            return gyaVar;
        } finally {
            bC.close();
            a2.j();
        }
    }

    public static void o(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            gsy.a();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            gsy.a();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }

    public static void p(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(aqjn.aK(arrayList, ",", null, null, null, 62));
    }

    public static int q(WorkDatabase workDatabase, String str) {
        int i;
        Long a2 = workDatabase.v().a(str);
        int i2 = 0;
        if (a2 != null) {
            i = (int) a2.longValue();
        } else {
            i = 0;
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i + 1;
        }
        r(workDatabase, str, i2);
        return i;
    }

    public static void r(WorkDatabase workDatabase, String str, int i) {
        workDatabase.v().b(new gxt(str, Long.valueOf(i)));
    }

    public static gys s(List list, gys gysVar) {
        list.getClass();
        boolean f = gysVar.g.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean f2 = gysVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean f3 = gysVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (!f && f2 && f3) {
            String str = gysVar.e;
            hgi hgiVar = new hgi((char[]) null);
            hgiVar.k(gysVar.g);
            hgiVar.n("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            return gys.g(gysVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", hgiVar.j(), 0, 0L, 0, 0, 0L, 0, 16777195);
        }
        return gysVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static gtd t(UUID uuid, gvd gvdVar) {
        uuid.getClass();
        gvf gvfVar = gvdVar.d.m;
        ?? r1 = gvdVar.l.b;
        r1.getClass();
        return bI(gvfVar, "CancelWorkById", r1, new gqx(gvdVar, uuid, 4, null));
    }

    public static void u(gvd gvdVar, String str) {
        lhm d;
        WorkDatabase workDatabase = gvdVar.e;
        workDatabase.getClass();
        gyt A = workDatabase.A();
        gxq u = workDatabase.u();
        List D = aqjn.D(str);
        while (!D.isEmpty()) {
            String str2 = (String) aqjn.N(D);
            gtk a2 = A.a(str2);
            if (a2 != gtk.SUCCEEDED && a2 != gtk.FAILED) {
                gzn gznVar = (gzn) A;
                gznVar.a.k();
                gkp d2 = gznVar.d.d();
                d2.g(1, str2);
                try {
                    ((gzn) A).a.l();
                    try {
                        d2.a();
                        ((gzn) A).a.o();
                    } finally {
                    }
                } finally {
                    gznVar.d.f(d2);
                }
            }
            D.addAll(u.a(str2));
        }
        gud gudVar = gvdVar.g;
        gudVar.getClass();
        synchronized (gudVar.j) {
            gsy.a().c(gud.a, a.cp(str, "Processor cancelling "));
            gudVar.h.add(str);
            d = gudVar.d(str);
        }
        gud.f(str, d, 1);
        Iterator it = gvdVar.f.iterator();
        while (it.hasNext()) {
            ((guf) it.next()).b(str);
        }
    }

    public static void v(String str, gvd gvdVar) {
        str.getClass();
        WorkDatabase workDatabase = gvdVar.e;
        workDatabase.getClass();
        workDatabase.n(new faq(workDatabase, str, gvdVar, 15));
    }

    public static void w(gvd gvdVar) {
        guh.a(gvdVar.d, gvdVar.e, gvdVar.f);
    }

    public static int x(gry gryVar) {
        gryVar.getClass();
        int ordinal = gryVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            throw new armm();
        }
        return 0;
    }

    public static int y(gtf gtfVar) {
        gtfVar.getClass();
        int ordinal = gtfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            throw new armm();
        }
        return 0;
    }

    public static int z(gtk gtkVar) {
        gtkVar.getClass();
        int ordinal = gtkVar.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new armm();
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }

    public boolean e() {
        return false;
    }

    public boolean f(int[] iArr) {
        return false;
    }

    public void g(int i) {
        throw null;
    }

    public boolean k(int i) {
        throw null;
    }

    public gvf(char[] cArr) {
    }

    public gvf(byte[] bArr, byte[] bArr2) {
        new to();
        new HashMap();
    }

    public void b() {
    }

    public void bT(int i) {
    }

    public void c(gkd gkdVar) {
    }

    public void a(Object obj, boolean z) {
    }

    public void h(int i, float f, int i2) {
    }
}
