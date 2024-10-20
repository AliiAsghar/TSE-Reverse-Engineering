package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkt {
    public int a;
    public int b;
    public final Object c;

    public atkt(Context context) {
        this.a = 0;
        this.c = context;
    }

    private final void s(int i) {
        if (i <= d()) {
        } else {
            throw new atoc("end of input");
        }
    }

    public final int a() {
        return ((ByteBuffer) this.c).position();
    }

    public final int b() {
        s(2);
        return (char) ((ByteBuffer) this.c).getShort();
    }

    public final int c() {
        s(1);
        return ((ByteBuffer) this.c).get() & 255;
    }

    public final int d() {
        return ((ByteBuffer) this.c).remaining();
    }

    public final long e() {
        s(4);
        return ((ByteBuffer) this.c).getInt() & 4294967295L;
    }

    public final void f(byte[] bArr, int i, int i2) {
        s(i2);
        ((ByteBuffer) this.c).get(bArr, i, i2);
    }

    public final void g(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        if (i <= byteBuffer.capacity() - byteBuffer.position()) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.c;
            byteBuffer2.limit(byteBuffer2.position() + i);
            return;
        }
        throw new IllegalArgumentException("cannot set active region past end of input");
    }

    public final byte[] h() {
        int d = d();
        byte[] bArr = new byte[d];
        ((ByteBuffer) this.c).get(bArr, 0, d);
        return bArr;
    }

    public final byte[] i(int i) {
        s(i);
        byte[] bArr = new byte[i];
        ((ByteBuffer) this.c).get(bArr, 0, i);
        return bArr;
    }

    public final byte[] j() {
        return i(c());
    }

    public final void k(byte[] bArr) {
        ((OutputStream) this.c).write(bArr);
        this.b += bArr.length;
        this.a++;
    }

    public final void l() {
        ((OutputStream) this.c).close();
    }

    public final void m() {
        ((OutputStream) this.c).flush();
    }

    public final void n() {
        ((ByteArrayOutputStream) this.c).reset();
        this.b = 0;
    }

    public final byte[] o() {
        return ((ByteArrayOutputStream) this.c).toByteArray();
    }

    public final void p(byte[] bArr, int i) {
        ((OutputStream) this.c).write(bArr, 0, i);
        this.b += i;
        this.a++;
    }

    public final synchronized int q() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = abvn.b((Context) this.c).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public final synchronized int r() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        Object obj = this.c;
        PackageManager packageManager = ((Context) obj).getPackageManager();
        if (((Context) abvn.b((Context) obj).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.a = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.a = 2;
            return 2;
        }
        Log.e("Metadata", "Google Play services missing or without correct permission.");
        return 0;
    }

    public atkt() {
        this.b = 0;
        this.a = 0;
        this.c = new ByteArrayOutputStream();
    }

    public atkt(byte[] bArr) {
        this.c = ByteBuffer.wrap(bArr);
        this.a = -1;
        this.b = -1;
    }
}
