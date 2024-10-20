package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abos;
import defpackage.zfj;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new abos(19);
    public static final zfj j = new zfj(new String[0]);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    int[] g;
    public int h;
    boolean i;
    private final boolean k;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.i = false;
        this.k = true;
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final int a(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i >= 0 && i < this.h) {
            z = true;
        } else {
            z = false;
        }
        abhg.h(z);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        if (i2 == length) {
            return i2 - 1;
        }
        return i2;
    }

    public final String b(String str, int i, int i2) {
        c(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    public final void c(String str, int i) {
        Bundle bundle = this.c;
        if (bundle != null && bundle.containsKey(str)) {
            if (!e()) {
                if (i >= 0 && i < this.h) {
                    return;
                } else {
                    throw new CursorIndexOutOfBoundsException(i, this.h);
                }
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        throw new IllegalArgumentException("No such column: ".concat(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void d() {
        this.c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i2], i2);
            i2++;
        }
        this.g = new int[this.d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i < cursorWindowArr.length) {
                this.g[i] = i3;
                i3 += this.d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.h = i3;
                return;
            }
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    protected final void finalize() {
        try {
            if (this.k && this.d.length > 0 && !e()) {
                close();
                Log.e("DataBuffer", a.bX(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int e = abhi.e(parcel);
        abhi.F(parcel, 1, strArr);
        abhi.H(parcel, 2, this.d, i);
        abhi.m(parcel, 3, this.e);
        abhi.t(parcel, 4, this.f);
        abhi.m(parcel, 1000, this.a);
        abhi.g(parcel, e);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(zfj zfjVar, int i) {
        Object obj = zfjVar.a;
        this.i = false;
        this.k = true;
        this.a = 1;
        this.b = (String[]) obj;
        this.d = new CursorWindow[0];
        this.e = i;
        this.f = null;
        d();
    }
}
