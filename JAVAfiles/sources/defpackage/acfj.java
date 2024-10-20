package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class acfj implements Parcelable.Creator {
    private final Parcelable.Creator a;

    public acfj(Parcelable.Creator creator) {
        this.a = creator;
    }

    public static void a(SafeParcelable safeParcelable, Parcel parcel, acfi acfiVar) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                acfiVar.a(safeParcelable, obtain);
                byte[] marshall = obtain.marshall();
                File createTempFile = File.createTempFile("teleporter", ".tmp", null);
                RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
                randomAccessFile.write(marshall);
                randomAccessFile.seek(0L);
                createTempFile.delete();
                parcel.writeFileDescriptor(randomAccessFile.getFD());
                randomAccessFile.close();
            } catch (IOException e) {
                throw new acfk("Couldn't write SafeParcelable to unlinked file.", e);
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor readFileDescriptor = parcel.readFileDescriptor();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(readFileDescriptor));
            int available = dataInputStream.available();
            byte[] bArr = new byte[available];
            dataInputStream.read(bArr);
            dataInputStream.close();
            readFileDescriptor.close();
            Parcelable.Creator creator = this.a;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, available);
                obtain.setDataPosition(0);
                Object createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
                return (SafeParcelable) createFromParcel;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (IOException e) {
            throw new acfk("Couldn't read from unlinked file.", e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (SafeParcelable[]) this.a.newArray(i);
    }
}
