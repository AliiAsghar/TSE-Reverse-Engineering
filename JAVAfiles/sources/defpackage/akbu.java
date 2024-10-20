package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbu implements Parcelable {
    public final int a;
    public boolean b;
    algw c;
    public Object d;
    public Object e;
    private Throwable g;
    private akbs h;
    private static final alvi f = alvi.m("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator<akbu> CREATOR = new ajuw(7);

    public akbu(int i, Object obj, ListenableFuture listenableFuture) {
        this.c = alfd.a;
        this.a = i;
        this.d = obj;
        albo.bR(listenableFuture, akto.h(new akbt(this)), andi.a);
    }

    private static void d(Object obj, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(dataPosition);
            ((alvg) ((alvg) ((alvg) f.h()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).q("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        akbs akbsVar = this.h;
        if (akbsVar != null) {
            Throwable th = this.g;
            if (th != null) {
                akbsVar.a.execute(akto.j(new adub(akbsVar, this, th, 11)));
            } else {
                akbsVar.a.execute(akto.j(new adub(akbsVar, this, this.e, 10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(akbs akbsVar) {
        this.h = akbsVar;
        if (akbsVar != null && this.b) {
            a();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.d;
        String str3 = "";
        if (obj == null) {
            str = "";
        } else {
            str = "input=" + obj.getClass().getName() + ";";
        }
        Object obj2 = this.e;
        if (obj2 == null) {
            str2 = "";
        } else {
            str2 = "result=" + obj2.getClass().getName() + ";";
        }
        Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ";";
        }
        return "ParcelableFuture(" + str + str2 + str3 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        int i2 = 1;
        try {
            d(this.d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        if (true != this.b) {
            i2 = 2;
        }
        parcel.writeInt(i2);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public akbu(Parcel parcel) {
        this.c = alfd.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            this.c = algw.i(Integer.valueOf(readInt));
            if (readInt == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((alvg) ((alvg) ((alvg) f.h()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).r("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }
}
