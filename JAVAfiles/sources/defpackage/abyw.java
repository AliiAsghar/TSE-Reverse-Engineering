package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String str = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        Account account = null;
        KeyMetadata keyMetadata = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 1:
                    i = abhi.N(parcel, readInt);
                    break;
                case 2:
                    z = abhi.al(parcel, readInt);
                    break;
                case 3:
                    bArr = abhi.am(parcel, readInt);
                    break;
                case 4:
                    bArr2 = abhi.am(parcel, readInt);
                    break;
                case 5:
                    bArr3 = abhi.am(parcel, readInt);
                    break;
                case 6:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 7:
                    bArr4 = abhi.am(parcel, readInt);
                    break;
                case 8:
                    bArr5 = abhi.am(parcel, readInt);
                    break;
                case 9:
                    account = (Account) abhi.V(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 11:
                    keyMetadata = (KeyMetadata) abhi.V(parcel, readInt, KeyMetadata.CREATOR);
                    break;
                case 12:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 13:
                    bArr6 = abhi.am(parcel, readInt);
                    break;
                case 14:
                    bArr7 = abhi.am(parcel, readInt);
                    break;
                case 15:
                    j = abhi.Q(parcel, readInt);
                    break;
                case 16:
                    z4 = abhi.al(parcel, readInt);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new KeyData(i, z, bArr, bArr2, bArr3, str, bArr4, bArr5, account, z2, keyMetadata, z3, bArr6, bArr7, j, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyData[i];
    }
}
