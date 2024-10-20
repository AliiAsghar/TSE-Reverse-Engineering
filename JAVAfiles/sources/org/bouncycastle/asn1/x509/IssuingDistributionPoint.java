package org.bouncycastle.asn1.x509;

import defpackage.aotl;
import defpackage.atdg;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IssuingDistributionPoint extends ASN1Object {
    public boolean a;
    private DistributionPointName b;
    private boolean c;
    private boolean d;
    private ReasonFlags e;
    private boolean f;
    private ASN1Sequence g;

    private IssuingDistributionPoint(ASN1Sequence aSN1Sequence) {
        this.g = aSN1Sequence;
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1TaggedObject m = ASN1TaggedObject.m(aSN1Sequence.h(i));
            int i2 = m.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    this.f = ASN1Boolean.i(m).h();
                                } else {
                                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                                }
                            } else {
                                this.a = ASN1Boolean.i(m).h();
                            }
                        } else {
                            this.e = new ReasonFlags(ASN1BitString.o(m));
                        }
                    } else {
                        this.d = ASN1Boolean.i(m).h();
                    }
                } else {
                    this.c = ASN1Boolean.i(m).h();
                }
            } else {
                this.b = DistributionPointName.a(m);
            }
        }
    }

    public static IssuingDistributionPoint a(Object obj) {
        if (obj instanceof IssuingDistributionPoint) {
            return (IssuingDistributionPoint) obj;
        }
        if (obj != null) {
            return new IssuingDistributionPoint(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.g;
    }

    public final String toString() {
        String str = atdg.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        DistributionPointName distributionPointName = this.b;
        if (distributionPointName != null) {
            aotl.L(stringBuffer, str, "distributionPoint", distributionPointName.toString());
        }
        if (this.c) {
            aotl.L(stringBuffer, str, "onlyContainsUserCerts", "true");
        }
        if (this.d) {
            aotl.L(stringBuffer, str, "onlyContainsCACerts", "true");
        }
        ReasonFlags reasonFlags = this.e;
        if (reasonFlags != null) {
            aotl.L(stringBuffer, str, "onlySomeReasons", reasonFlags.e());
        }
        if (this.f) {
            aotl.L(stringBuffer, str, "onlyContainsAttributeCerts", "true");
        }
        if (this.a) {
            aotl.L(stringBuffer, str, "indirectCRL", "true");
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
