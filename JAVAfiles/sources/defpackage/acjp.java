package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 2:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 3:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 4:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 5:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 6:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 7:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 8:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 9:
                    cart = (Cart) abhi.V(parcel, readInt, Cart.CREATOR);
                    break;
                case 10:
                    z6 = abhi.al(parcel, readInt);
                    break;
                case 11:
                    z7 = abhi.al(parcel, readInt);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) abhi.ar(parcel, readInt, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z = abhi.al(parcel, readInt);
                    break;
                case 14:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 15:
                    arrayList = abhi.ah(parcel, readInt, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) abhi.V(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = abhi.ae(parcel, readInt);
                    break;
                case 18:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new MaskedWalletRequest(str, z3, z4, z5, str2, str3, str4, cart, z6, z7, countrySpecificationArr, z, z2, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
