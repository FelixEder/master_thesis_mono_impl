package systems.systemE.dataclasses

/**
 * Data class that stores information about a payslip for a specific person in the system E.
 * If a person has a IAVCertificate, the flag "hasCert" is set to true.
 * If a person doesn't have a certificate, the "certId" field is set to -1.
 *
 * @author Felix Eder
 * @date 2021-04-20
 */
data class SystemEIavPayslip(val employerId: Int, val personalNumber: String, val hasCert: Boolean, val certId: Int,
                             val year: Int, val month: Int, val income: Int)
