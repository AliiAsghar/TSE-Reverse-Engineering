package org.bouncycastle.asn1.x509;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.LocaleUtil;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Time extends ASN1Object implements ASN1Choice {
    ASN1Primitive a;

    public Time(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", LocaleUtil.a);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String concat = String.valueOf(simpleDateFormat.format(date)).concat("Z");
        int parseInt = Integer.parseInt(concat.substring(0, 4));
        if (parseInt >= 1950 && parseInt <= 2049) {
            this.a = new DERUTCTime(concat.substring(2));
        } else {
            this.a = new DERGeneralizedTime(concat);
        }
    }

    public static Time c(Object obj) {
        if (obj != null && !(obj instanceof Time)) {
            if (obj instanceof ASN1UTCTime) {
                return new Time((ASN1UTCTime) obj);
            }
            if (obj instanceof ASN1GeneralizedTime) {
                return new Time((ASN1GeneralizedTime) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (Time) obj;
    }

    public final String a() {
        ASN1Primitive aSN1Primitive = this.a;
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return ((ASN1UTCTime) aSN1Primitive).e();
        }
        return ((ASN1GeneralizedTime) aSN1Primitive).e();
    }

    public final Date b() {
        try {
            ASN1Primitive aSN1Primitive = this.a;
            if (aSN1Primitive instanceof ASN1UTCTime) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", LocaleUtil.a);
                simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                return simpleDateFormat.parse(((ASN1UTCTime) aSN1Primitive).e());
            }
            return ((ASN1GeneralizedTime) aSN1Primitive).f();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public final String toString() {
        return a();
    }

    public Time(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime) && !(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.a = aSN1Primitive;
    }
}
