import axios from 'axios'
import { toast } from 'react-toastify'
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request'

import './styles.css'

interface NotificationButtonProps {
  saleId: number
}

function handleClickButton(saleId: number) {
  axios
    .get(`${BASE_URL}/sales/${saleId}/notification`)
    .then(() => toast.info("SMS enviado com sucesso"))
}

function NotificationButton({ saleId }: NotificationButtonProps) {
  return (
    <div className="dsmeta-red-btn" onClick={() => handleClickButton(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton
